.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-transport"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(La/pzu;)La/mos0;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$2(La/dgd;)La/mos0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(La/pzu;)La/mos0;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$1(La/dgd;)La/mos0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(La/pzu;)La/mos0;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$0(La/dgd;)La/mos0;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(La/dgd;)La/mos0;
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    invoke-interface {p0, v0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p0}, La/eps0;->b(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, La/eps0;->a()La/eps0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, La/ug9;->f:La/ug9;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/eps0;->c(La/ug9;)La/nos0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static synthetic lambda$getComponents$1(La/dgd;)La/mos0;
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    invoke-interface {p0, v0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p0}, La/eps0;->b(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, La/eps0;->a()La/eps0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, La/ug9;->f:La/ug9;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/eps0;->c(La/ug9;)La/nos0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static synthetic lambda$getComponents$2(La/dgd;)La/mos0;
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    invoke-interface {p0, v0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p0}, La/eps0;->b(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, La/eps0;->a()La/eps0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, La/ug9;->e:La/ug9;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/eps0;->c(La/ug9;)La/nos0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La/pfd;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, La/mos0;

    .line 2
    .line 3
    invoke-static {p0}, La/pfd;->b(Ljava/lang/Class;)La/ofd;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "fire-transport"

    .line 8
    .line 9
    iput-object v1, v0, La/ofd;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-class v2, Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v2}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v0, v3}, La/ofd;->a(La/c7k;)V

    .line 18
    .line 19
    .line 20
    new-instance v3, La/v4i0;

    .line 21
    .line 22
    const/16 v4, 0x16

    .line 23
    .line 24
    invoke-direct {v3, v4}, La/v4i0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    iput-object v3, v0, La/ofd;->f:La/jgd;

    .line 28
    .line 29
    invoke-virtual {v0}, La/ofd;->b()La/pfd;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v3, La/jkd0;

    .line 34
    .line 35
    const-class v4, La/fjz;

    .line 36
    .line 37
    invoke-direct {v3, v4, p0}, La/jkd0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, La/pfd;->a(La/jkd0;)La/ofd;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v2}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v3, v4}, La/ofd;->a(La/c7k;)V

    .line 49
    .line 50
    .line 51
    new-instance v4, La/v4i0;

    .line 52
    .line 53
    const/16 v5, 0x17

    .line 54
    .line 55
    invoke-direct {v4, v5}, La/v4i0;-><init>(B)V

    .line 56
    .line 57
    .line 58
    iput-object v4, v3, La/ofd;->f:La/jgd;

    .line 59
    .line 60
    invoke-virtual {v3}, La/ofd;->b()La/pfd;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    new-instance v4, La/jkd0;

    .line 65
    .line 66
    const-class v5, La/kos0;

    .line 67
    .line 68
    invoke-direct {v4, v5, p0}, La/jkd0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v4}, La/pfd;->a(La/jkd0;)La/ofd;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {v2}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {p0, v2}, La/ofd;->a(La/c7k;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, La/v4i0;

    .line 83
    .line 84
    const/16 v4, 0x18

    .line 85
    .line 86
    invoke-direct {v2, v4}, La/v4i0;-><init>(B)V

    .line 87
    .line 88
    .line 89
    iput-object v2, p0, La/ofd;->f:La/jgd;

    .line 90
    .line 91
    invoke-virtual {p0}, La/ofd;->b()La/pfd;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const-string v2, "19.0.0"

    .line 96
    .line 97
    invoke-static {v1, v2}, La/q0x;->I(Ljava/lang/String;Ljava/lang/String;)La/pfd;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    filled-new-array {v0, v3, p0, v1}, [La/pfd;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method
