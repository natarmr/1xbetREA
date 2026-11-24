.class public final La/xzt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pru;


# direct methods
.method public constructor <init>(La/pru;B)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/xzt;->a:La/pru;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/xzt;->a:La/pru;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Z)Ljava/util/ArrayList;
    .locals 3

    .line 1
    iget-object p0, p0, La/xzt;->a:La/pru;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/sff0;->a:La/gx7;

    .line 8
    .line 9
    iget-object p0, p0, La/gx7;->a:La/gm7;

    .line 10
    .line 11
    invoke-static {p0, p1}, La/thb;->S(La/gm7;Z)La/lc00;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_0
    :goto_0
    move-object v0, p0

    .line 26
    check-cast v0, La/paw;

    .line 27
    .line 28
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, La/q4f;

    .line 40
    .line 41
    sget-object v2, La/q4f;->x:La/q4f;

    .line 42
    .line 43
    if-eq v1, v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return-object p1
.end method
