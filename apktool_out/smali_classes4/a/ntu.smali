.class public final La/ntu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j1q0;


# direct methods
.method public constructor <init>(La/j1q0;B)V
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
    iput-object p1, p0, La/ntu;->a:La/j1q0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/ntu;->a:La/j1q0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/ntu;->a:La/j1q0;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, La/ntu;->a:La/j1q0;

    .line 2
    .line 3
    iget-object v0, p0, La/j1q0;->a:La/m1q0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/m1q0;->o()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string p0, "https://mobilaserverstest.xyz"

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v0, p0, La/j1q0;->a:La/m1q0;

    .line 15
    .line 16
    invoke-virtual {v0}, La/m1q0;->p()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const-string p0, "https://mobserverstestii.xyz"

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 26
    .line 27
    invoke-virtual {p0}, La/m1q0;->g()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const-string p0, "https://mobilaserverslux.xyz"

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    sget-object p0, La/ujn;->h:Ljava/lang/String;

    .line 37
    .line 38
    return-object p0
.end method
