.class public final La/ufe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/kwj;La/cgk0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/ufe;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/ufe;->b:I

    .line 8
    .line 9
    iput-object p2, p0, La/ufe;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/ufe;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/beo0;ILa/l7m0;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/ufe;->a:B

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ufe;->c:Ljava/lang/Object;

    iput p2, p0, La/ufe;->b:I

    iput-object p3, p0, La/ufe;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/pz40;La/ngk0;I)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/ufe;->a:B

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ufe;->c:Ljava/lang/Object;

    iput-object p2, p0, La/ufe;->d:Ljava/lang/Object;

    iput p3, p0, La/ufe;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/ufe;->a:B

    .line 2
    .line 3
    iget v1, p0, La/ufe;->b:I

    .line 4
    .line 5
    iget-object v2, p0, La/ufe;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, La/ufe;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/j6z;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast p0, La/pz40;

    .line 18
    .line 19
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    const-wide/16 v5, 0x1

    .line 30
    .line 31
    add-long/2addr v3, v5

    .line 32
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p0, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast v2, La/ngk0;

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v2, p0, p1}, La/ngk0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    check-cast p1, La/j6z;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    check-cast p0, La/kwj;

    .line 57
    .line 58
    invoke-virtual {p0}, La/xk80;->k()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-ne v1, p0, :cond_0

    .line 63
    .line 64
    check-cast v2, La/cgk0;

    .line 65
    .line 66
    invoke-interface {p1}, La/j6z;->g()J

    .line 67
    .line 68
    .line 69
    move-result-wide p0

    .line 70
    const/16 v0, 0x20

    .line 71
    .line 72
    shr-long/2addr p0, v0

    .line 73
    long-to-int p0, p0

    .line 74
    invoke-virtual {v2, p0}, La/cgk0;->m(I)V

    .line 75
    .line 76
    .line 77
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_1
    check-cast p1, Lorg/xplatform/uikit/components/chips/Chip;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast p0, La/beo0;

    .line 86
    .line 87
    iget-object p0, p0, La/beo0;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/chips/Chip;->setText(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    check-cast v2, La/l7m0;

    .line 93
    .line 94
    check-cast v2, La/cgk0;

    .line 95
    .line 96
    invoke-virtual {v2}, La/cgk0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, Ljava/lang/Number;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-ne v1, p0, :cond_1

    .line 107
    .line 108
    const/4 p0, 0x1

    .line 109
    goto :goto_0

    .line 110
    :cond_1
    const/4 p0, 0x0

    .line 111
    :goto_0
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/chips/Chip;->setSelected(Z)V

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
