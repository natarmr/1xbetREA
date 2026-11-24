.class public final La/fny;
.super La/jjt;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:La/fny;

.field public static final KEY_DATA_FIELD_NUMBER:I = 0x1

.field public static final KEY_ID_FIELD_NUMBER:I = 0x3

.field public static final OUTPUT_PREFIX_TYPE_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:La/hq80; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/hq80;"
        }
    .end annotation
.end field

.field public static final STATUS_FIELD_NUMBER:I = 0x2


# instance fields
.field private keyData_:La/fky;

.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/fny;

    .line 2
    .line 3
    invoke-direct {v0}, La/jjt;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/fny;->DEFAULT_INSTANCE:La/fny;

    .line 7
    .line 8
    const-class v1, La/fny;

    .line 9
    .line 10
    invoke-static {v1, v0}, La/jjt;->u(Ljava/lang/Class;La/jjt;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static C()La/eny;
    .locals 1

    .line 1
    sget-object v0, La/fny;->DEFAULT_INSTANCE:La/fny;

    .line 2
    .line 3
    invoke-virtual {v0}, La/jjt;->i()La/yit;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/eny;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final A()La/zky;
    .locals 1

    .line 1
    iget p0, p0, La/fny;->status_:I

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p0, v0, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    if-eq p0, v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p0, La/zky;->e:La/zky;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sget-object p0, La/zky;->d:La/zky;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object p0, La/zky;->c:La/zky;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    sget-object p0, La/zky;->b:La/zky;

    .line 26
    .line 27
    :goto_0
    if-nez p0, :cond_4

    .line 28
    .line 29
    sget-object p0, La/zky;->f:La/zky;

    .line 30
    .line 31
    :cond_4
    return-object p0
.end method

.method public final B()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/fny;->keyData_:La/fky;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final D(La/fky;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fny;->keyData_:La/fky;

    .line 2
    .line 3
    return-void
.end method

.method public final E(I)V
    .locals 0

    .line 1
    iput p1, p0, La/fny;->keyId_:I

    .line 2
    .line 3
    return-void
.end method

.method public final F(La/af80;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, La/af80;->b()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, La/fny;->outputPrefixType_:I

    .line 6
    .line 7
    return-void
.end method

.method public final G()V
    .locals 1

    .line 1
    sget-object v0, La/zky;->c:La/zky;

    .line 2
    .line 3
    invoke-virtual {v0}, La/zky;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, La/fny;->status_:I

    .line 8
    .line 9
    return-void
.end method

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
    sget-object p0, La/fny;->PARSER:La/hq80;

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-class p1, La/fny;

    .line 18
    .line 19
    monitor-enter p1

    .line 20
    :try_start_0
    sget-object p0, La/fny;->PARSER:La/hq80;

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    new-instance p0, La/cjt;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object p0, La/fny;->PARSER:La/hq80;

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
    sget-object p0, La/fny;->DEFAULT_INSTANCE:La/fny;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_2
    new-instance p0, La/eny;

    .line 43
    .line 44
    sget-object p1, La/fny;->DEFAULT_INSTANCE:La/fny;

    .line 45
    .line 46
    invoke-direct {p0, p1}, La/yit;-><init>(La/jjt;)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_3
    new-instance p0, La/fny;

    .line 51
    .line 52
    invoke-direct {p0}, La/jjt;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_4
    const-string p0, "keyData_"

    .line 57
    .line 58
    const-string p1, "status_"

    .line 59
    .line 60
    const-string v0, "keyId_"

    .line 61
    .line 62
    const-string v1, "outputPrefixType_"

    .line 63
    .line 64
    filled-new-array {p0, p1, v0, v1}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const-string p1, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u000c\u0003\u000b\u0004\u000c"

    .line 69
    .line 70
    sget-object v0, La/fny;->DEFAULT_INSTANCE:La/fny;

    .line 71
    .line 72
    new-instance v1, La/x9e0;

    .line 73
    .line 74
    invoke-direct {v1, v0, p1, p0}, La/x9e0;-><init>(La/x3;Ljava/lang/String;[Ljava/lang/Object;)V

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

.method public final x()La/fky;
    .locals 0

    .line 1
    iget-object p0, p0, La/fny;->keyData_:La/fky;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, La/fky;->x()La/fky;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    return-object p0
.end method

.method public final y()I
    .locals 0

    .line 1
    iget p0, p0, La/fny;->keyId_:I

    .line 2
    .line 3
    return p0
.end method

.method public final z()La/af80;
    .locals 0

    .line 1
    iget p0, p0, La/fny;->outputPrefixType_:I

    .line 2
    .line 3
    invoke-static {p0}, La/af80;->a(I)La/af80;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, La/af80;->g:La/af80;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method
