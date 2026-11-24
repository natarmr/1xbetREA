.class public final synthetic La/peq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qeq0;


# direct methods
.method public synthetic constructor <init>(La/qeq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/peq0;->a:B

    iput-object p1, p0, La/peq0;->b:La/qeq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/peq0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/peq0;->b:La/qeq0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/qeq0;->Y1:La/g9m0;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v2, v0, La/vmv;

    .line 20
    .line 21
    const-string v3, "Can not find dependencies provider for "

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    check-cast v0, La/vmv;

    .line 26
    .line 27
    check-cast v0, Lorg/platform/app/ApplicationLoader;

    .line 28
    .line 29
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    new-instance v1, La/s2m0;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v2, La/s470;->Companion:La/r470;

    .line 47
    .line 48
    iget-object v3, p0, La/qeq0;->U1:La/r34;

    .line 49
    .line 50
    sget-object v4, La/qeq0;->Z1:[La/iiy;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    aget-object v4, v4, v5

    .line 54
    .line 55
    invoke-virtual {v3, p0, v4}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v4}, La/r470;->a(J)La/s470;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    new-instance v2, La/gxi;

    .line 71
    .line 72
    new-instance v3, La/sek;

    .line 73
    .line 74
    invoke-direct {v3}, La/sek;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-direct {v2, v1, v3, v0, p0}, La/gxi;-><init>(La/s2m0;La/sek;La/g8i;La/s470;)V

    .line 78
    .line 79
    .line 80
    move-object v1, v2

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    const-string p0, "null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies"

    .line 83
    .line 84
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-static {p0, v3}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    invoke-static {p0, v3}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    return-object v1

    .line 96
    :pswitch_0
    sget-object v0, La/qeq0;->Y1:La/g9m0;

    .line 97
    .line 98
    new-instance v0, La/ry3;

    .line 99
    .line 100
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object p0, p0, La/qeq0;->V1:La/i6i;

    .line 105
    .line 106
    if-eqz p0, :cond_3

    .line 107
    .line 108
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 109
    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_3
    const-string p0, "viewModelFactory"

    .line 113
    .line 114
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
