.class public final synthetic La/dfd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dfd0;->a:B

    iput-object p1, p0, La/dfd0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    iget-byte p1, p0, La/dfd0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x6

    .line 5
    const/16 v2, 0x42

    .line 6
    .line 7
    iget-object p0, p0, La/dfd0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 13
    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-ne p1, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-ne p2, v1, :cond_1

    .line 24
    .line 25
    :goto_0
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_1
    return v0

    .line 29
    :pswitch_0
    check-cast p0, La/np30;

    .line 30
    .line 31
    if-eqz p3, :cond_2

    .line 32
    .line 33
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-ne p1, v2, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    if-ne p2, v1, :cond_3

    .line 41
    .line 42
    :goto_1
    invoke-virtual {p0}, La/np30;->invoke()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_3
    return v0

    .line 46
    :pswitch_1
    check-cast p0, La/xhd0;

    .line 47
    .line 48
    sget-object p1, La/xhd0;->S1:La/fl70;

    .line 49
    .line 50
    if-eqz p3, :cond_4

    .line 51
    .line 52
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-ne p1, v2, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    if-ne p2, v1, :cond_5

    .line 60
    .line 61
    :goto_2
    invoke-virtual {p0}, La/xhd0;->H0()La/jid0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, La/jid0;->x()V

    .line 66
    .line 67
    .line 68
    :cond_5
    return v0

    .line 69
    :pswitch_2
    check-cast p0, La/jgd0;

    .line 70
    .line 71
    sget-object p1, La/jgd0;->V1:La/xi70;

    .line 72
    .line 73
    if-eqz p3, :cond_6

    .line 74
    .line 75
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-ne p1, v2, :cond_6

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    if-ne p2, v1, :cond_7

    .line 83
    .line 84
    :goto_3
    invoke-virtual {p0}, La/jgd0;->I0()La/shd0;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, La/shd0;->A()V

    .line 89
    .line 90
    .line 91
    :cond_7
    return v0

    .line 92
    :pswitch_3
    check-cast p0, La/gfd0;

    .line 93
    .line 94
    sget-object p1, La/gfd0;->S1:La/mi70;

    .line 95
    .line 96
    if-eqz p3, :cond_8

    .line 97
    .line 98
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-ne p1, v2, :cond_8

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_8
    if-ne p2, v1, :cond_9

    .line 106
    .line 107
    :goto_4
    invoke-virtual {p0}, La/gfd0;->I0()La/fgd0;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, La/fgd0;->A()V

    .line 112
    .line 113
    .line 114
    :cond_9
    return v0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
