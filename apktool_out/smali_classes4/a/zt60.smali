.class public final synthetic La/zt60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hwq0;
.implements La/k4r;


# instance fields
.field public final synthetic a:La/cu60;


# direct methods
.method public synthetic constructor <init>(La/cu60;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/zt60;->a:La/cu60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, La/cu60;->U1:La/evz;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "SELECT_BALANCE_REQUEST_KEY"

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p2, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p1, La/ql5;

    .line 31
    .line 32
    iget-wide v0, p1, La/ql5;->a:J

    .line 33
    .line 34
    iget-object p0, p0, La/zt60;->a:La/cu60;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p2, p0, La/h2b;->x:La/kyg0;

    .line 41
    .line 42
    invoke-virtual {p2, v0, v1}, La/kyg0;->a(J)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, La/h2b;->y:La/wsf0;

    .line 46
    .line 47
    invoke-virtual {p2}, La/wsf0;->b()La/ot;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sget-object v3, La/bm5;->d:La/bm5;

    .line 52
    .line 53
    invoke-virtual {v2, v3, p1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, La/wsf0;->q()La/jyg0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object p1, p1, La/jyg0;->a:La/rrd;

    .line 61
    .line 62
    invoke-virtual {p1, v3, v0, v1}, La/rrd;->z(La/bm5;J)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, La/h2b;->C()V

    .line 66
    .line 67
    .line 68
    :cond_1
    :goto_0
    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 4

    .line 1
    sget-object v0, La/cu60;->U1:La/evz;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const v0, 0x7f0a025c

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-ne p1, v0, :cond_2

    .line 12
    .line 13
    iget-object p0, p0, La/zt60;->a:La/cu60;

    .line 14
    .line 15
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p1, p0, La/h2b;->b:La/i1w0;

    .line 20
    .line 21
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v2, p0, La/h2b;->r:La/uyn;

    .line 26
    .line 27
    iget-object p0, p0, La/h2b;->R:Ljava/util/Map;

    .line 28
    .line 29
    invoke-virtual {v2, p0}, La/uyn;->a(Ljava/util/Map;)Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    instance-of v2, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    new-instance v2, La/e1w0;

    .line 38
    .line 39
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 40
    .line 41
    invoke-direct {v2, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, La/c8d;

    .line 45
    .line 46
    sget-object v3, La/y7d;->a:La/v7d;

    .line 47
    .line 48
    invoke-direct {p0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance v2, La/w0w0;

    .line 56
    .line 57
    invoke-direct {v2, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 58
    .line 59
    .line 60
    new-instance p0, La/c8d;

    .line 61
    .line 62
    sget-object v3, La/y7d;->a:La/v7d;

    .line 63
    .line 64
    invoke-direct {p0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-static {p1, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_1
    move-object v0, p0

    .line 75
    check-cast v0, La/paw;

    .line 76
    .line 77
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_1

    .line 82
    .line 83
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, La/oe50;

    .line 88
    .line 89
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    const/4 p0, 0x1

    .line 94
    return p0

    .line 95
    :cond_2
    return v1
.end method
