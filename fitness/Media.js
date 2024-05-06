import React, { useState } from "react";
import { TextField } from "@material-ui/core/TextField";
import { makeStyles } from "@material-ui/core/styles";
import { Container, Paper } from "@material-ui/core";



const useStyles = makeStyles((theme) => ({
    root: {
      '& > *': {
        margin: theme.spacing(1),
       
      },
    },
  }));

  export default function Media(){
    const paperStyle = {padding: '50px 20px', width:600, margin:"20px auto"}
    const[description, setDescription] = useState('')
    const[fileurl, setFileurl] = useState('')
    const classes = useStyles();

    return (

        <Container>
            <Paper elevation={3} style={paperStyle}>

                <h1 style={{color: "blue"}}><u>Add New</u></h1>

            <form className={classes.root} noValidate autoComplete="off">
                <TextField id="outlined-basic" label="Description" variant="outlined" fullWidth 
                value={description}
                onChange={(e)=>setDescription(e.targt.value)}/>
                <TextField id="outlined-basic" label="File Url" variant="outlined" fullWidth
                value={fileurl}
                onChange={(e)=>setFileurl(e.targt.value)} />
            </form>
            </Paper> 
        </Container>
    );
  }