.class public abstract La/iyw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tmw0;


# static fields
.field public static final a:La/y50;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/y50;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/y50;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/iyw0;->a:La/y50;

    .line 9
    .line 10
    return-void
.end method

.method public static a(La/nrw0;)La/bww0;
    .locals 3

    .line 1
    new-instance v0, La/vow0;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/vow0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sget-object v1, La/bww0;->c:[B

    .line 9
    .line 10
    invoke-static {}, La/vow0;->b()Ljavax/crypto/Cipher;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, La/bww0;->a(Ljavax/crypto/Cipher;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v1, La/bww0;

    .line 21
    .line 22
    iget-object v2, p0, La/nrw0;->b:La/rkt0;

    .line 23
    .line 24
    iget-object v2, v2, La/rkt0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, La/icw0;

    .line 27
    .line 28
    invoke-virtual {v2}, La/icw0;->b()[B

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object p0, p0, La/nrw0;->c:La/icw0;

    .line 33
    .line 34
    invoke-virtual {p0}, La/icw0;->b()[B

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v1, v2, p0, v0}, La/bww0;-><init>([B[BLa/vow0;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_0
    const-string p0, "Cipher does not implement AES GCM SIV."

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method
