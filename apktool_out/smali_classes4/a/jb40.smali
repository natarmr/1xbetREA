.class public final synthetic La/jb40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lb40;


# direct methods
.method public synthetic constructor <init>(La/lb40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jb40;->a:B

    iput-object p1, p0, La/jb40;->b:La/lb40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/jb40;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jb40;->b:La/lb40;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/pc40;

    .line 9
    .line 10
    sget-object v0, La/lb40;->P1:La/htz;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-class v0, La/kc40;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object v1, La/kc40;->l2:La/uuz;

    .line 33
    .line 34
    iget-object p1, p1, La/pc40;->a:Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v1, La/kc40;

    .line 40
    .line 41
    invoke-direct {v1}, La/kc40;-><init>()V

    .line 42
    .line 43
    .line 44
    sget-object v2, La/kc40;->m2:[La/iiy;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    aget-object v2, v2, v3

    .line 48
    .line 49
    iget-object v3, v1, La/kc40;->k2:La/khf0;

    .line 50
    .line 51
    invoke-virtual {v3, v1, v2, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v1, p1, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-virtual {p0}, La/lb40;->G0()La/k3t0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    sget-object p1, La/ra40;->a:La/ra40;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_0
    check-cast p1, La/bb40;

    .line 74
    .line 75
    sget-object v0, La/lb40;->P1:La/htz;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, La/lb40;->G0()La/k3t0;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1
    check-cast p1, La/xb40;

    .line 91
    .line 92
    sget-object v0, La/lb40;->P1:La/htz;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, La/lb40;->G0()La/k3t0;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    new-instance v0, La/za40;

    .line 102
    .line 103
    invoke-direct {v0, p1}, La/za40;-><init>(La/xb40;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
