.class public final La/pva;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/ViewGroup;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/pva;->a:B

    iput-object p1, p0, La/pva;->b:Landroid/view/ViewGroup;

    iput-object p2, p0, La/pva;->c:Ljava/lang/Object;

    iput-object p3, p0, La/pva;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 12

    .line 1
    iget-byte p2, p0, La/pva;->a:B

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    iget-object v0, p0, La/pva;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v1, p0, La/pva;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v2, p0, La/pva;->b:Landroid/view/ViewGroup;

    .line 9
    .line 10
    packed-switch p2, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 14
    .line 15
    .line 16
    check-cast v2, Landroid/webkit/WebView;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {v2, p3, p0}, Landroid/view/View;->scrollTo(II)V

    .line 25
    .line 26
    .line 27
    check-cast v0, La/kxc0;

    .line 28
    .line 29
    sget-object p0, La/kxc0;->Y1:La/jh70;

    .line 30
    .line 31
    invoke-virtual {v0}, La/kxc0;->L0()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 36
    .line 37
    .line 38
    check-cast v2, Landroid/webkit/WebView;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-virtual {v2, p3, p0}, Landroid/view/View;->scrollTo(II)V

    .line 47
    .line 48
    .line 49
    check-cast v0, La/qwc0;

    .line 50
    .line 51
    sget-object p0, La/qwc0;->Z1:La/rl70;

    .line 52
    .line 53
    invoke-virtual {v0}, La/qwc0;->L0()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 61
    .line 62
    .line 63
    check-cast v2, La/i8l;

    .line 64
    .line 65
    invoke-static {v2}, La/i8l;->a(La/i8l;)La/j8l;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v1, La/d8l;

    .line 70
    .line 71
    iget-object p0, v2, La/i8l;->a:La/p7l;

    .line 72
    .line 73
    invoke-virtual {p0}, La/p7l;->e()I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    invoke-virtual {p0}, La/p7l;->f()F

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    iget-wide v5, v1, La/d8l;->a:J

    .line 82
    .line 83
    move-object v7, v0

    .line 84
    check-cast v7, La/vne;

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    const/16 v11, 0x20

    .line 88
    .line 89
    const v4, 0x7f0804ad

    .line 90
    .line 91
    .line 92
    invoke-static/range {v3 .. v11}, La/j8l;->l(La/j8l;IJLa/vne;IFLa/ucj;I)V

    .line 93
    .line 94
    .line 95
    invoke-static {v2}, La/i8l;->a(La/i8l;)La/j8l;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iget-boolean p1, v1, La/d8l;->b:Z

    .line 100
    .line 101
    if-eqz p1, :cond_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    const/16 p3, 0x8

    .line 105
    .line 106
    :goto_0
    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    .line 107
    .line 108
    .line 109
    iput-boolean p1, v2, La/i8l;->j:Z

    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 116
    .line 117
    .line 118
    check-cast v2, Landroid/webkit/WebView;

    .line 119
    .line 120
    check-cast v1, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    invoke-virtual {v2, p3, p0}, Landroid/view/View;->scrollTo(II)V

    .line 127
    .line 128
    .line 129
    check-cast v0, La/bib;

    .line 130
    .line 131
    sget-object p0, La/bib;->X1:La/bj5;

    .line 132
    .line 133
    invoke-virtual {v0}, La/bib;->L0()V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 141
    .line 142
    .line 143
    check-cast v2, La/qva;

    .line 144
    .line 145
    check-cast v1, Landroid/widget/TextView;

    .line 146
    .line 147
    check-cast v0, Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v2, v1, v0}, La/qva;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
