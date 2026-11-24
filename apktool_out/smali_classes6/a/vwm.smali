.class public final synthetic La/vwm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:J

.field public final synthetic e:Z

.field public final synthetic f:I

.field public final synthetic g:B


# direct methods
.method public synthetic constructor <init>(La/mm40;IJZLkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    const/4 p7, 0x2

    iput-byte p7, p0, La/vwm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vwm;->b:La/mm40;

    iput p2, p0, La/vwm;->f:I

    iput-wide p3, p0, La/vwm;->d:J

    iput-boolean p5, p0, La/vwm;->e:Z

    iput-object p6, p0, La/vwm;->c:Ljava/lang/Object;

    iput-byte p8, p0, La/vwm;->g:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;JZIIB)V
    .locals 0

    .line 2
    iput-byte p8, p0, La/vwm;->a:B

    iput-object p1, p0, La/vwm;->b:La/mm40;

    iput-object p2, p0, La/vwm;->c:Ljava/lang/Object;

    iput-wide p3, p0, La/vwm;->d:J

    iput-boolean p5, p0, La/vwm;->e:Z

    iput p6, p0, La/vwm;->f:I

    iput-byte p7, p0, La/vwm;->g:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/vwm;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/vwm;->c:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v6, v0

    .line 9
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    move-object v7, p1

    .line 12
    check-cast v7, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-static {p1}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    iget-object v1, p0, La/vwm;->b:La/mm40;

    .line 25
    .line 26
    iget v2, p0, La/vwm;->f:I

    .line 27
    .line 28
    iget-wide v3, p0, La/vwm;->d:J

    .line 29
    .line 30
    iget-boolean v5, p0, La/vwm;->e:Z

    .line 31
    .line 32
    iget-byte v9, p0, La/vwm;->g:B

    .line 33
    .line 34
    invoke-static/range {v1 .. v9}, La/bfb;->F(La/mm40;IJZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    iget-object v0, p0, La/vwm;->c:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v2, v0

    .line 43
    check-cast v2, Ljava/lang/String;

    .line 44
    .line 45
    move-object v6, p1

    .line 46
    check-cast v6, La/fet;

    .line 47
    .line 48
    check-cast p2, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget p1, p0, La/vwm;->f:I

    .line 54
    .line 55
    or-int/lit8 p1, p1, 0x1

    .line 56
    .line 57
    invoke-static {p1}, La/x8x;->L(I)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    iget-object v1, p0, La/vwm;->b:La/mm40;

    .line 62
    .line 63
    iget-wide v3, p0, La/vwm;->d:J

    .line 64
    .line 65
    iget-boolean v5, p0, La/vwm;->e:Z

    .line 66
    .line 67
    iget-byte v8, p0, La/vwm;->g:B

    .line 68
    .line 69
    invoke-static/range {v1 .. v8}, La/ebc;->S(La/mm40;Ljava/lang/String;JZLa/fet;II)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_1
    iget-object v0, p0, La/vwm;->c:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v2, v0

    .line 78
    check-cast v2, Ljava/lang/String;

    .line 79
    .line 80
    move-object v6, p1

    .line 81
    check-cast v6, La/fet;

    .line 82
    .line 83
    check-cast p2, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget p1, p0, La/vwm;->f:I

    .line 89
    .line 90
    or-int/lit8 p1, p1, 0x1

    .line 91
    .line 92
    invoke-static {p1}, La/x8x;->L(I)I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    iget-object v1, p0, La/vwm;->b:La/mm40;

    .line 97
    .line 98
    iget-wide v3, p0, La/vwm;->d:J

    .line 99
    .line 100
    iget-boolean v5, p0, La/vwm;->e:Z

    .line 101
    .line 102
    iget-byte v8, p0, La/vwm;->g:B

    .line 103
    .line 104
    invoke-static/range {v1 .. v8}, La/aac;->F(La/mm40;Ljava/lang/String;JZLa/fet;II)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
