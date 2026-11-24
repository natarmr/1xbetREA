.class public abstract La/yyw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/h7x0;

.field public static final b:La/l5x0;

.field public static final c:La/zqw0;

.field public static final d:La/yqw0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/cpw0;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/cpw0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/h7x0;

    .line 9
    .line 10
    const-class v2, La/uyw0;

    .line 11
    .line 12
    const-class v3, La/ymw0;

    .line 13
    .line 14
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, La/yyw0;->a:La/h7x0;

    .line 18
    .line 19
    invoke-static {}, La/qbx0;->y()La/alw0;

    .line 20
    .line 21
    .line 22
    new-instance v0, La/l5x0;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    const-string v2, "type.googleapis.com/google.crypto.tink.AesSivKey"

    .line 26
    .line 27
    invoke-direct {v0, v1, v3, v2}, La/l5x0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, La/yyw0;->b:La/l5x0;

    .line 31
    .line 32
    new-instance v0, La/zqw0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/yyw0;->c:La/zqw0;

    .line 38
    .line 39
    new-instance v0, La/yqw0;

    .line 40
    .line 41
    const/16 v1, 0x9

    .line 42
    .line 43
    invoke-direct {v0, v1}, La/yqw0;-><init>(B)V

    .line 44
    .line 45
    .line 46
    sput-object v0, La/yyw0;->d:La/yqw0;

    .line 47
    .line 48
    return-void
.end method

.method public static a(La/zyw0;)V
    .locals 3

    .line 1
    iget v0, p0, La/zyw0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 9
    .line 10
    iget p0, p0, La/zyw0;->a:I

    .line 11
    .line 12
    const-string v1, "invalid key size: "

    .line 13
    .line 14
    const-string v2, ". Valid keys must have 64 bytes."

    .line 15
    .line 16
    invoke-static {p0, v1, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method
