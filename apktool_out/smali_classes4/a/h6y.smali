.class public final synthetic La/h6y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k6y;


# direct methods
.method public synthetic constructor <init>(La/k6y;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h6y;->a:B

    iput-object p1, p0, La/h6y;->b:La/k6y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-byte p1, p0, La/h6y;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/h6y;->b:La/k6y;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/k6y;->Q1:La/sqt;

    .line 9
    .line 10
    invoke-virtual {p0}, La/k6y;->H0()La/t6y;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p1, p0, La/t6y;->g:La/i1w0;

    .line 15
    .line 16
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object p0, p0, La/t6y;->f:La/uyn;

    .line 21
    .line 22
    invoke-virtual {p0}, La/uyn;->d()Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    instance-of v1, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    new-instance v1, La/e1w0;

    .line 31
    .line 32
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 33
    .line 34
    invoke-direct {v1, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 35
    .line 36
    .line 37
    new-instance p0, La/c8d;

    .line 38
    .line 39
    sget-object v2, La/y7d;->a:La/v7d;

    .line 40
    .line 41
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v1, La/w0w0;

    .line 49
    .line 50
    invoke-direct {v1, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 51
    .line 52
    .line 53
    new-instance p0, La/c8d;

    .line 54
    .line 55
    sget-object v2, La/y7d;->a:La/v7d;

    .line 56
    .line 57
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :goto_0
    const/4 p0, 0x0

    .line 64
    invoke-static {p1, v0, p0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :goto_1
    move-object v0, p0

    .line 69
    check-cast v0, La/paw;

    .line 70
    .line 71
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, La/oe50;

    .line 82
    .line 83
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    return-void

    .line 88
    :pswitch_0
    sget-object p1, La/k6y;->Q1:La/sqt;

    .line 89
    .line 90
    invoke-virtual {p0}, La/k6y;->H0()La/t6y;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, La/t6y;->w()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
