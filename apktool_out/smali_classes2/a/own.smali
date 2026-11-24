.class public final La/own;
.super La/jjt;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:La/own;

.field public static final ENCRYPTED_KEYSET_FIELD_NUMBER:I = 0x2

.field public static final KEYSET_INFO_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:La/hq80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/hq80;"
        }
    .end annotation
.end field


# instance fields
.field private encryptedKeyset_:La/og9;

.field private keysetInfo_:La/mny;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/own;

    .line 2
    .line 3
    invoke-direct {v0}, La/own;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/own;->DEFAULT_INSTANCE:La/own;

    .line 7
    .line 8
    const-class v1, La/own;

    .line 9
    .line 10
    invoke-static {v1, v0}, La/jjt;->u(Ljava/lang/Class;La/jjt;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, La/jjt;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/og9;->b:La/kg9;

    .line 5
    .line 6
    iput-object v0, p0, La/own;->encryptedKeyset_:La/og9;

    .line 7
    .line 8
    return-void
.end method

.method public static y()La/nwn;
    .locals 1

    .line 1
    sget-object v0, La/own;->DEFAULT_INSTANCE:La/own;

    .line 2
    .line 3
    invoke-virtual {v0}, La/jjt;->i()La/yit;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/nwn;

    .line 8
    .line 9
    return-object v0
.end method

.method public static z(Ljava/io/ByteArrayInputStream;La/qso;)La/own;
    .locals 2

    .line 1
    sget-object v0, La/own;->DEFAULT_INSTANCE:La/own;

    .line 2
    .line 3
    new-instance v1, La/myc;

    .line 4
    .line 5
    invoke-direct {v1, p0}, La/myc;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1, p1}, La/jjt;->t(La/jjt;La/oyc;La/qso;)La/jjt;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, La/jjt;->h(La/jjt;)V

    .line 13
    .line 14
    .line 15
    check-cast p0, La/own;

    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method public final A(La/kg9;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/own;->encryptedKeyset_:La/og9;

    .line 2
    .line 3
    return-void
.end method

.method public final B(La/mny;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/own;->keysetInfo_:La/mny;

    .line 2
    .line 3
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
    sget-object p0, La/own;->PARSER:La/hq80;

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-class p1, La/own;

    .line 18
    .line 19
    monitor-enter p1

    .line 20
    :try_start_0
    sget-object p0, La/own;->PARSER:La/hq80;

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
    sput-object p0, La/own;->PARSER:La/hq80;

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
    sget-object p0, La/own;->DEFAULT_INSTANCE:La/own;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_2
    new-instance p0, La/nwn;

    .line 43
    .line 44
    sget-object p1, La/own;->DEFAULT_INSTANCE:La/own;

    .line 45
    .line 46
    invoke-direct {p0, p1}, La/yit;-><init>(La/jjt;)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_3
    new-instance p0, La/own;

    .line 51
    .line 52
    invoke-direct {p0}, La/own;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_4
    const-string p0, "encryptedKeyset_"

    .line 57
    .line 58
    const-string p1, "keysetInfo_"

    .line 59
    .line 60
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string p1, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t"

    .line 65
    .line 66
    sget-object v0, La/own;->DEFAULT_INSTANCE:La/own;

    .line 67
    .line 68
    new-instance v1, La/x9e0;

    .line 69
    .line 70
    invoke-direct {v1, v0, p1, p0}, La/x9e0;-><init>(La/x3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    :pswitch_5
    return-object p1

    .line 75
    :pswitch_6
    const/4 p0, 0x1

    .line 76
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
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

.method public final x()La/og9;
    .locals 0

    .line 1
    iget-object p0, p0, La/own;->encryptedKeyset_:La/og9;

    .line 2
    .line 3
    return-object p0
.end method
