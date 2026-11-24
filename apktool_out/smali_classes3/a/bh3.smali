.class public final La/bh3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r9u;


# direct methods
.method public constructor <init>(La/r9u;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/bh3;->a:La/r9u;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 1

    .line 1
    sget-object v0, La/ygp;->n1:La/ygp;

    .line 2
    .line 3
    iget-object p0, p0, La/bh3;->a:La/r9u;

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
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance p0, Lorg/xplatform/app_start/impl/navigation/AppStartScreenFactoryImpl$loadScreen$1;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    new-instance p0, Lorg/xplatform/app_start/impl/navigation/AppStartScreenFactoryImpl$appStartScreen$1;

    .line 28
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method
