.class public final La/rd90;
.super La/kjt;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:La/rd90;

.field private static volatile PARSER:La/iq80; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/iq80;"
        }
    .end annotation
.end field

.field public static final SESSION_ID_FIELD_NUMBER:I = 0x1

.field public static final SESSION_VERBOSITY_FIELD_NUMBER:I = 0x2

.field private static final sessionVerbosity_converter_:La/ylx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/ylx;"
        }
    .end annotation
.end field


# instance fields
.field private bitField0_:I

.field private sessionId_:Ljava/lang/String;

.field private sessionVerbosity_:La/xlx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/mi70;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/rd90;->sessionVerbosity_converter_:La/ylx;

    .line 7
    .line 8
    new-instance v0, La/rd90;

    .line 9
    .line 10
    invoke-direct {v0}, La/rd90;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/rd90;->DEFAULT_INSTANCE:La/rd90;

    .line 14
    .line 15
    const-class v1, La/rd90;

    .line 16
    .line 17
    invoke-static {v1, v0}, La/kjt;->p(Ljava/lang/Class;La/kjt;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, La/kjt;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, La/rd90;->sessionId_:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v0, La/sjx;->d:La/sjx;

    .line 9
    .line 10
    iput-object v0, p0, La/rd90;->sessionVerbosity_:La/xlx;

    .line 11
    .line 12
    return-void
.end method

.method public static u()La/qd90;
    .locals 1

    .line 1
    sget-object v0, La/rd90;->DEFAULT_INSTANCE:La/rd90;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kjt;->i()La/zit;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/qd90;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final j(I)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, La/hne;->E(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, La/e9d0;->b()V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :pswitch_0
    sget-object p0, La/rd90;->PARSER:La/iq80;

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-class p1, La/rd90;

    .line 18
    .line 19
    monitor-enter p1

    .line 20
    :try_start_0
    sget-object p0, La/rd90;->PARSER:La/iq80;

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    new-instance p0, La/djt;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object p0, La/rd90;->PARSER:La/iq80;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit p1

    .line 35
    return-object p0

    .line 36
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p0

    .line 38
    :cond_1
    return-object p0

    .line 39
    :pswitch_1
    sget-object p0, La/rd90;->DEFAULT_INSTANCE:La/rd90;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_2
    new-instance p0, La/qd90;

    .line 43
    .line 44
    sget-object p1, La/rd90;->DEFAULT_INSTANCE:La/rd90;

    .line 45
    .line 46
    invoke-direct {p0, p1}, La/zit;-><init>(La/kjt;)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_3
    new-instance p0, La/rd90;

    .line 51
    .line 52
    invoke-direct {p0}, La/rd90;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_4
    const-string p0, "bitField0_"

    .line 57
    .line 58
    const-string p1, "sessionId_"

    .line 59
    .line 60
    const-string v0, "sessionVerbosity_"

    .line 61
    .line 62
    sget-object v1, La/ujn;->Y:La/ujn;

    .line 63
    .line 64
    filled-new-array {p0, p1, v0, v1}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const-string p1, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u081e"

    .line 69
    .line 70
    sget-object v0, La/rd90;->DEFAULT_INSTANCE:La/rd90;

    .line 71
    .line 72
    new-instance v1, La/y9e0;

    .line 73
    .line 74
    invoke-direct {v1, v0, p1, p0}, La/y9e0;-><init>(La/y3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-object v1

    .line 78
    :pswitch_5
    return-object p1

    .line 79
    :pswitch_6
    const/4 p0, 0x1

    .line 80
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r()V
    .locals 5

    .line 1
    iget-object v0, p0, La/rd90;->sessionVerbosity_:La/xlx;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, La/n4;

    .line 5
    .line 6
    iget-boolean v1, v1, La/n4;->a:Z

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    check-cast v0, La/sjx;

    .line 12
    .line 13
    iget v1, v0, La/sjx;->c:I

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const/16 v3, 0xa

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    mul-int/lit8 v3, v1, 0x2

    .line 21
    .line 22
    :goto_0
    if-lt v3, v1, :cond_1

    .line 23
    .line 24
    new-instance v1, La/sjx;

    .line 25
    .line 26
    iget-object v4, v0, La/sjx;->b:[I

    .line 27
    .line 28
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([II)[I

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget v0, v0, La/sjx;->c:I

    .line 33
    .line 34
    invoke-direct {v1, v3, v0, v2}, La/sjx;-><init>([IIZ)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, La/rd90;->sessionVerbosity_:La/xlx;

    .line 38
    .line 39
    move-object v0, v1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-static {}, La/e9d0;->o()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    :goto_1
    check-cast v0, La/sjx;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, La/sjx;->c(I)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final s()I
    .locals 2

    .line 1
    iget-object p0, p0, La/rd90;->sessionVerbosity_:La/xlx;

    .line 2
    .line 3
    check-cast p0, La/sjx;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, La/sjx;->f(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    if-eq p0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v0, v1

    .line 19
    :goto_0
    if-nez v0, :cond_2

    .line 20
    .line 21
    return v1

    .line 22
    :cond_2
    return v0
.end method

.method public final t()I
    .locals 0

    .line 1
    iget-object p0, p0, La/rd90;->sessionVerbosity_:La/xlx;

    .line 2
    .line 3
    check-cast p0, La/sjx;

    .line 4
    .line 5
    invoke-virtual {p0}, La/sjx;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final v(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, La/rd90;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, La/rd90;->bitField0_:I

    .line 9
    .line 10
    iput-object p1, p0, La/rd90;->sessionId_:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method
