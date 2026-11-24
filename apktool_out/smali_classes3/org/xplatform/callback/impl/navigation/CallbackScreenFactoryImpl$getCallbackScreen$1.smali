.class public final Lorg/xplatform/callback/impl/navigation/CallbackScreenFactoryImpl$getCallbackScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/callback/impl/navigation/CallbackScreenFactoryImpl$getCallbackScreen$1",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:La/ou9;

.field public final synthetic b:La/wo9;


# direct methods
.method public constructor <init>(La/ou9;La/wo9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/callback/impl/navigation/CallbackScreenFactoryImpl$getCallbackScreen$1;->a:La/ou9;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/callback/impl/navigation/CallbackScreenFactoryImpl$getCallbackScreen$1;->b:La/wo9;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/xplatform/callback/impl/navigation/CallbackScreenFactoryImpl$getCallbackScreen$1;->b:La/wo9;

    .line 2
    .line 3
    iget-object v1, v0, La/wo9;->b:La/bs10;

    .line 4
    .line 5
    iget-wide v2, v0, La/wo9;->c:J

    .line 6
    .line 7
    iget-boolean v0, v0, La/wo9;->a:Z

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lorg/xplatform/callback/impl/navigation/CallbackScreenFactoryImpl$getCallbackScreen$1;->a:La/ou9;

    .line 13
    .line 14
    iget-object p0, p0, La/ou9;->a:La/j1q0;

    .line 15
    .line 16
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object p1, La/ygp;->n:La/ygp;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const/4 p1, 0x3

    .line 28
    const/4 v4, 0x2

    .line 29
    const/4 v5, 0x1

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    sget-object p0, La/qr10;->V1:La/evz;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance p0, La/qr10;

    .line 38
    .line 39
    invoke-direct {p0}, La/qr10;-><init>()V

    .line 40
    .line 41
    .line 42
    sget-object v6, La/qr10;->W1:[La/iiy;

    .line 43
    .line 44
    aget-object v5, v6, v5

    .line 45
    .line 46
    iget-object v7, p0, La/qr10;->R1:La/cgx0;

    .line 47
    .line 48
    invoke-virtual {v7, p0, v5, v0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, La/qr10;->S1:La/r34;

    .line 52
    .line 53
    aget-object v4, v6, v4

    .line 54
    .line 55
    invoke-virtual {v0, p0, v4, v2, v3}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 56
    .line 57
    .line 58
    iget-boolean v0, v1, La/bs10;->a:Z

    .line 59
    .line 60
    iget-object v1, p0, La/qr10;->U1:La/zz2;

    .line 61
    .line 62
    aget-object p1, v6, p1

    .line 63
    .line 64
    invoke-virtual {v1, p0, p1, v0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_0
    sget-object p0, La/yr10;->R1:La/wsz;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance p0, La/yr10;

    .line 74
    .line 75
    invoke-direct {p0}, La/yr10;-><init>()V

    .line 76
    .line 77
    .line 78
    sget-object v6, La/yr10;->S1:[La/iiy;

    .line 79
    .line 80
    aget-object v5, v6, v5

    .line 81
    .line 82
    iget-object v7, p0, La/yr10;->O1:La/cgx0;

    .line 83
    .line 84
    invoke-virtual {v7, p0, v5, v0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, La/yr10;->P1:La/r34;

    .line 88
    .line 89
    aget-object v4, v6, v4

    .line 90
    .line 91
    invoke-virtual {v0, p0, v4, v2, v3}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 92
    .line 93
    .line 94
    iget-boolean v0, v1, La/bs10;->a:Z

    .line 95
    .line 96
    iget-object v1, p0, La/yr10;->Q1:La/zz2;

    .line 97
    .line 98
    aget-object p1, v6, p1

    .line 99
    .line 100
    invoke-virtual {v1, p0, p1, v0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 101
    .line 102
    .line 103
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, La/ufx;->C(La/m7h0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
