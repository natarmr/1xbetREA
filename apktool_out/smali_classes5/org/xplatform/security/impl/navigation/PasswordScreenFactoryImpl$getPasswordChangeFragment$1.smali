.class public final Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;
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
        "org/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1",
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
.field public final synthetic a:La/zn00;

.field public final synthetic b:La/we50;


# direct methods
.method public constructor <init>(La/zn00;La/we50;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;->a:La/zn00;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;->b:La/we50;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;->a:La/zn00;

    .line 5
    .line 6
    iget-object v0, p1, La/zn00;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/r9u;

    .line 9
    .line 10
    sget-object v1, La/ygp;->A1:La/ygp;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    iget-object p0, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;->b:La/we50;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object p1, p1, La/zn00;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, La/pru;

    .line 34
    .line 35
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-boolean p1, p1, La/sff0;->Q1:Z

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    sget-object p1, La/byo;->P1:La/bek;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance p1, La/byo;

    .line 52
    .line 53
    invoke-direct {p1}, La/byo;-><init>()V

    .line 54
    .line 55
    .line 56
    sget-object v0, La/byo;->Q1:[La/iiy;

    .line 57
    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p1, La/byo;->M1:La/yzn0;

    .line 61
    .line 62
    invoke-virtual {v1, p1, v0, p0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_0
    sget-object p1, La/xz80;->U1:La/xi70;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance p1, La/xz80;

    .line 75
    .line 76
    invoke-direct {p1}, La/xz80;-><init>()V

    .line 77
    .line 78
    .line 79
    sget-object v0, La/xz80;->V1:[La/iiy;

    .line 80
    .line 81
    aget-object v0, v0, v1

    .line 82
    .line 83
    iget-object v1, p1, La/xz80;->S1:La/yzn0;

    .line 84
    .line 85
    invoke-virtual {v1, p1, v0, p0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 86
    .line 87
    .line 88
    return-object p1
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
