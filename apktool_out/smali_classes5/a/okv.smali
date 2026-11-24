.class public final synthetic La/okv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wdr;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLa/wdr;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/okv;->a:B

    iput-object p2, p0, La/okv;->b:La/wdr;

    iput-object p3, p0, La/okv;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/cp;La/q1j0;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/okv;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/okv;->c:Ljava/lang/Object;

    iput-object p2, p0, La/okv;->b:La/wdr;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/okv;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/okv;->b:La/wdr;

    .line 4
    .line 5
    iget-object p0, p0, La/okv;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/cp;

    .line 11
    .line 12
    check-cast v1, La/q1j0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->isPressed()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of p1, p1, La/bej0;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/bej0;

    .line 36
    .line 37
    iget-object p1, p0, La/bej0;->a:Ljava/lang/String;

    .line 38
    .line 39
    iget v0, p0, La/bej0;->b:I

    .line 40
    .line 41
    iget-boolean p0, p0, La/bej0;->d:Z

    .line 42
    .line 43
    new-instance v2, La/bej0;

    .line 44
    .line 45
    invoke-direct {v2, p2, p0, p1, v0}, La/bej0;-><init>(ZZLjava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, La/q1j0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v1, p0}, La/q1j0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    return-void

    .line 60
    :pswitch_0
    check-cast v1, La/lma0;

    .line 61
    .line 62
    check-cast p0, La/cp;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->isPressed()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/jui0;

    .line 83
    .line 84
    iget-object p0, p0, La/jui0;->f:La/aib0;

    .line 85
    .line 86
    invoke-virtual {v1, p1, p0}, La/lma0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :goto_1
    return-void

    .line 90
    :pswitch_1
    check-cast v1, La/e000;

    .line 91
    .line 92
    check-cast p0, La/cr10;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v1, p0, p1}, La/e000;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_2
    check-cast v1, La/vft;

    .line 106
    .line 107
    check-cast p0, La/cp;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/view/View;->isPressed()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-nez p1, :cond_3

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {v1, p0}, La/vft;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :goto_2
    return-void

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
