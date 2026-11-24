.class public final La/f53;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h53;


# direct methods
.method public synthetic constructor <init>(La/h53;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f53;->a:B

    iput-object p1, p0, La/f53;->b:La/h53;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/f53;->a:B

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    iget-object p0, p0, La/f53;->b:La/h53;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, La/ou90;

    .line 16
    .line 17
    iget-object v0, p0, La/h53;->s:La/pu90;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-wide v7, p0, La/h53;->u:J

    .line 23
    .line 24
    iget-object p0, p0, La/h53;->r:La/i53;

    .line 25
    .line 26
    iget-object v4, p0, La/i53;->b:La/u12;

    .line 27
    .line 28
    iget p0, v0, La/pu90;->a:I

    .line 29
    .line 30
    iget v5, v0, La/pu90;->b:I

    .line 31
    .line 32
    int-to-long v9, p0

    .line 33
    shl-long/2addr v9, v3

    .line 34
    int-to-long v5, v5

    .line 35
    and-long/2addr v1, v5

    .line 36
    or-long v5, v9, v1

    .line 37
    .line 38
    sget-object v9, La/k6z;->a:La/k6z;

    .line 39
    .line 40
    invoke-interface/range {v4 .. v9}, La/u12;->a(JJLa/k6z;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    invoke-static {p1, v0, v1, v2}, La/ou90;->j(La/ou90;La/pu90;J)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_0
    check-cast p1, La/ou90;

    .line 51
    .line 52
    iget-object v0, p0, La/h53;->t:La/pu90;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-wide v7, p0, La/h53;->v:J

    .line 58
    .line 59
    iget-object p0, p0, La/h53;->r:La/i53;

    .line 60
    .line 61
    iget-object v4, p0, La/i53;->b:La/u12;

    .line 62
    .line 63
    iget p0, v0, La/pu90;->a:I

    .line 64
    .line 65
    iget v5, v0, La/pu90;->b:I

    .line 66
    .line 67
    int-to-long v9, p0

    .line 68
    shl-long/2addr v9, v3

    .line 69
    int-to-long v5, v5

    .line 70
    and-long/2addr v1, v5

    .line 71
    or-long v5, v9, v1

    .line 72
    .line 73
    sget-object v9, La/k6z;->a:La/k6z;

    .line 74
    .line 75
    invoke-interface/range {v4 .. v9}, La/u12;->a(JJLa/k6z;)J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    invoke-static {p1, v0, v1, v2}, La/ou90;->j(La/ou90;La/pu90;J)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
