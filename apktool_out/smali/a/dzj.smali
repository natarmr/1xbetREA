.class public final La/dzj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/miu0;


# static fields
.field public static final b:La/dzj;


# instance fields
.field public final synthetic a:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/dzj;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/dzj;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/dzj;->b:La/dzj;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/dzj;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Class;)La/diu0;
    .locals 1

    .line 1
    iget-byte p0, p0, La/dzj;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p0, La/diu0;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    new-instance p0, La/rq00;

    .line 22
    .line 23
    invoke-direct {p0}, La/rq00;-><init>()V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    new-instance p0, La/w1r;

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    invoke-direct {p0, p1}, La/w1r;-><init>(Z)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_2
    const-class p0, La/uo4;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    new-instance v0, La/uo4;

    .line 43
    .line 44
    sget-object p0, La/xzc0;->a:La/wzc0;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    sget-object p0, La/wzc0;->b:La/n0o0;

    .line 50
    .line 51
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, La/xzc0;

    .line 56
    .line 57
    sget-object p1, La/oo4;->a:La/no4;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object p1, La/no4;->b:La/n0o0;

    .line 63
    .line 64
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, La/oo4;

    .line 69
    .line 70
    invoke-direct {v0, p0, p1}, La/uo4;-><init>(La/xzc0;La/oo4;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const-string p0, "Unknown ViewModel class"

    .line 75
    .line 76
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    return-object v0

    .line 80
    :pswitch_3
    invoke-static {p1}, La/x1x;->B(Ljava/lang/Class;)La/diu0;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
