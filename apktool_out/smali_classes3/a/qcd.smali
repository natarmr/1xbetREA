.class public final synthetic La/qcd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:J


# direct methods
.method public synthetic constructor <init>(La/mm40;IIZJJJIB)V
    .locals 0

    .line 2
    iput-byte p12, p0, La/qcd;->a:B

    iput-object p1, p0, La/qcd;->b:La/mm40;

    iput p2, p0, La/qcd;->c:I

    iput p3, p0, La/qcd;->d:I

    iput-boolean p4, p0, La/qcd;->e:Z

    iput-wide p5, p0, La/qcd;->f:J

    iput-wide p7, p0, La/qcd;->g:J

    iput-wide p9, p0, La/qcd;->h:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;JJJZIII)V
    .locals 0

    .line 1
    const/4 p11, 0x0

    iput-byte p11, p0, La/qcd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qcd;->b:La/mm40;

    iput-wide p2, p0, La/qcd;->f:J

    iput-wide p4, p0, La/qcd;->g:J

    iput-wide p6, p0, La/qcd;->h:J

    iput-boolean p8, p0, La/qcd;->e:Z

    iput p9, p0, La/qcd;->c:I

    iput p10, p0, La/qcd;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/qcd;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v10, p1

    .line 7
    check-cast v10, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-static {p1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget v1, p0, La/qcd;->c:I

    .line 20
    .line 21
    iget v2, p0, La/qcd;->d:I

    .line 22
    .line 23
    iget-wide v4, p0, La/qcd;->f:J

    .line 24
    .line 25
    iget-wide v6, p0, La/qcd;->g:J

    .line 26
    .line 27
    iget-wide v8, p0, La/qcd;->h:J

    .line 28
    .line 29
    iget-object v11, p0, La/qcd;->b:La/mm40;

    .line 30
    .line 31
    iget-boolean v12, p0, La/qcd;->e:Z

    .line 32
    .line 33
    invoke-static/range {v1 .. v12}, La/ktt0;->a(IIIJJJLa/fet;La/mm40;Z)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    move-object v9, p1

    .line 40
    check-cast v9, La/fet;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    invoke-static {p1}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget v0, p0, La/qcd;->c:I

    .line 53
    .line 54
    iget v1, p0, La/qcd;->d:I

    .line 55
    .line 56
    iget-wide v3, p0, La/qcd;->f:J

    .line 57
    .line 58
    iget-wide v5, p0, La/qcd;->g:J

    .line 59
    .line 60
    iget-wide v7, p0, La/qcd;->h:J

    .line 61
    .line 62
    iget-object v10, p0, La/qcd;->b:La/mm40;

    .line 63
    .line 64
    iget-boolean v11, p0, La/qcd;->e:Z

    .line 65
    .line 66
    invoke-static/range {v0 .. v11}, La/p8n;->a(IIIJJJLa/fet;La/mm40;Z)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_1
    move-object v9, p1

    .line 73
    check-cast v9, La/fet;

    .line 74
    .line 75
    check-cast p2, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const/16 p1, 0x6001

    .line 81
    .line 82
    invoke-static {p1}, La/x8x;->L(I)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    iget v0, p0, La/qcd;->c:I

    .line 87
    .line 88
    iget v1, p0, La/qcd;->d:I

    .line 89
    .line 90
    iget-wide v3, p0, La/qcd;->f:J

    .line 91
    .line 92
    iget-wide v5, p0, La/qcd;->g:J

    .line 93
    .line 94
    iget-wide v7, p0, La/qcd;->h:J

    .line 95
    .line 96
    iget-object v10, p0, La/qcd;->b:La/mm40;

    .line 97
    .line 98
    iget-boolean v11, p0, La/qcd;->e:Z

    .line 99
    .line 100
    invoke-static/range {v0 .. v11}, La/f7k;->a(IIIJJJLa/fet;La/mm40;Z)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
