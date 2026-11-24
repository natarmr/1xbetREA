.class public final La/r46;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r9u;


# direct methods
.method public constructor <init>(La/r9u;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/r46;->a:La/r9u;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/r46;->a:La/r9u;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(La/r9u;C)V
    .locals 0

    .line 19
    iput-object p1, p0, La/r46;->a:La/r9u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;
    .locals 1

    .line 1
    new-instance v0, Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 2
    .line 3
    iget-object p0, p0, La/r46;->a:La/r9u;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;-><init>(La/r9u;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public b(La/b7b0;)La/yx5;
    .locals 2

    .line 1
    sget-object v0, La/ygp;->k:La/ygp;

    .line 2
    .line 3
    iget-object p0, p0, La/r46;->a:La/r9u;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/m1q0;->d(La/ygp;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v0, 0x1

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    sget-object p0, La/z5b0;->R1:La/mi70;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance p0, La/z5b0;

    .line 28
    .line 29
    invoke-direct {p0}, La/z5b0;-><init>()V

    .line 30
    .line 31
    .line 32
    sget-object v1, La/z5b0;->S1:[La/iiy;

    .line 33
    .line 34
    aget-object v0, v1, v0

    .line 35
    .line 36
    iget-object v1, p0, La/z5b0;->P1:La/yzn0;

    .line 37
    .line 38
    invoke-virtual {v1, p0, v0, p1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_0
    sget-object p0, La/z6b0;->S1:La/fl70;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance p0, La/z6b0;

    .line 48
    .line 49
    invoke-direct {p0}, La/z6b0;-><init>()V

    .line 50
    .line 51
    .line 52
    sget-object v1, La/z6b0;->U1:[La/iiy;

    .line 53
    .line 54
    aget-object v0, v1, v0

    .line 55
    .line 56
    iget-object v1, p0, La/z6b0;->Q1:La/yzn0;

    .line 57
    .line 58
    invoke-virtual {v1, p0, v0, p1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 59
    .line 60
    .line 61
    return-object p0
.end method
