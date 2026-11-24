.class public final synthetic La/dlq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/NumberPicker$OnValueChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/stl;


# direct methods
.method public synthetic constructor <init>(La/stl;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dlq0;->a:B

    iput-object p1, p0, La/dlq0;->b:La/stl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onValueChange(Landroid/widget/NumberPicker;II)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/dlq0;->a:B

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iget-object p0, p0, La/dlq0;->b:La/stl;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/f2i0;

    .line 10
    .line 11
    iget-object p1, p0, La/f2i0;->m2:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {p3, p1}, La/dqm0;->r(ILjava/util/ArrayList;)La/vhq0;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    sget-object p3, La/vhq0;->d:La/vhq0;

    .line 18
    .line 19
    if-ne p2, p3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 p2, 0x2

    .line 29
    if-ne p1, p2, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, La/f2i0;->b1(I)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object p1, p0, La/f2i0;->o2:Ljava/util/Calendar;

    .line 37
    .line 38
    const/16 p2, 0xa

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p0, p1}, La/f2i0;->b1(I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :pswitch_0
    check-cast p0, La/ilq0;

    .line 49
    .line 50
    sget-object p1, La/ilq0;->l2:La/s2m0;

    .line 51
    .line 52
    invoke-virtual {p0}, La/ilq0;->W0()La/nlq0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iget-object p0, p0, La/nlq0;->o:La/p7m0;

    .line 57
    .line 58
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_1
    check-cast p0, La/ilq0;

    .line 70
    .line 71
    sget-object p1, La/ilq0;->l2:La/s2m0;

    .line 72
    .line 73
    invoke-virtual {p0}, La/ilq0;->W0()La/nlq0;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iget-object p0, p0, La/nlq0;->n:La/p7m0;

    .line 78
    .line 79
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_2
    check-cast p0, La/ilq0;

    .line 91
    .line 92
    sget-object p1, La/ilq0;->l2:La/s2m0;

    .line 93
    .line 94
    invoke-virtual {p0}, La/ilq0;->W0()La/nlq0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    iget-object p0, p0, La/nlq0;->m:La/p7m0;

    .line 99
    .line 100
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
