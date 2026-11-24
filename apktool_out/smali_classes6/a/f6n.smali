.class public final synthetic La/f6n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:La/mm40;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(JJJLa/mm40;IIIB)V
    .locals 0

    .line 1
    iput-byte p11, p0, La/f6n;->a:B

    iput-wide p1, p0, La/f6n;->b:J

    iput-wide p3, p0, La/f6n;->c:J

    iput-wide p5, p0, La/f6n;->d:J

    iput-object p7, p0, La/f6n;->e:La/mm40;

    iput p8, p0, La/f6n;->f:I

    iput p9, p0, La/f6n;->g:I

    iput p10, p0, La/f6n;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/f6n;->a:B

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
    iget p1, p0, La/f6n;->h:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v11

    .line 22
    iget-wide v1, p0, La/f6n;->b:J

    .line 23
    .line 24
    iget-wide v3, p0, La/f6n;->c:J

    .line 25
    .line 26
    iget-wide v5, p0, La/f6n;->d:J

    .line 27
    .line 28
    iget-object v7, p0, La/f6n;->e:La/mm40;

    .line 29
    .line 30
    iget v8, p0, La/f6n;->f:I

    .line 31
    .line 32
    iget v9, p0, La/f6n;->g:I

    .line 33
    .line 34
    invoke-static/range {v1 .. v11}, La/j6n;->x(JJJLa/mm40;IILa/fet;I)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    move-object v9, p1

    .line 41
    check-cast v9, La/fet;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget p1, p0, La/f6n;->h:I

    .line 49
    .line 50
    or-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    invoke-static {p1}, La/x8x;->L(I)I

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    iget-wide v0, p0, La/f6n;->b:J

    .line 57
    .line 58
    iget-wide v2, p0, La/f6n;->c:J

    .line 59
    .line 60
    iget-wide v4, p0, La/f6n;->d:J

    .line 61
    .line 62
    iget-object v6, p0, La/f6n;->e:La/mm40;

    .line 63
    .line 64
    iget v7, p0, La/f6n;->f:I

    .line 65
    .line 66
    iget v8, p0, La/f6n;->g:I

    .line 67
    .line 68
    invoke-static/range {v0 .. v10}, La/j6n;->s(JJJLa/mm40;IILa/fet;I)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
