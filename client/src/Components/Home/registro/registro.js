import styles from './registro.module.css'

export default function Registro({ flag, name }){

   
    return (
        <div className={styles.mainContainer} >
            <img className={styles.image} loading="lazy"  src={flag ? flag : null} alt="flag not found"/>
            <div className={styles.innerContainer} >
                <h3 className={
styles.name
}> {name ? name : null}</h3>
                {/* <h5 ><button title="Add to Favorites" className={styles.botonfavorites}  >❤</button></h5> */}
            </div>
        </div>
    ) 