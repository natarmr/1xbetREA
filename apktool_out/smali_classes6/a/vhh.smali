.class public final synthetic La/vhh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JJLa/ugd;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/vhh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/vhh;->b:J

    iput-wide p3, p0, La/vhh;->c:J

    iput-object p5, p0, La/vhh;->e:Ljava/lang/Object;

    iput p6, p0, La/vhh;->d:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;JJI)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/vhh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vhh;->e:Ljava/lang/Object;

    iput-wide p2, p0, La/vhh;->b:J

    iput-wide p4, p0, La/vhh;->c:J

    iput p6, p0, La/vhh;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/vhh;->a:B

    .line 2
    .line 3
    iget v1, p0, La/vhh;->d:I

    .line 4
    .line 5
    iget-object v2, p0, La/vhh;->e:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, La/mm40;

    .line 12
    .line 13
    move-object v8, p1

    .line 14
    check-cast v8, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    or-int/lit8 p1, v1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    iget-wide v4, p0, La/vhh;->b:J

    .line 28
    .line 29
    iget-wide v6, p0, La/vhh;->c:J

    .line 30
    .line 31
    invoke-static/range {v3 .. v9}, La/atm0;->a(La/mm40;JJLa/fet;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    move-object v4, v2

    .line 38
    check-cast v4, La/ugd;

    .line 39
    .line 40
    move-object v5, p1

    .line 41
    check-cast v5, La/fet;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    or-int/lit8 p1, v1, 0x1

    .line 49
    .line 50
    invoke-static {p1}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    iget-wide v0, p0, La/vhh;->b:J

    .line 55
    .line 56
    iget-wide v2, p0, La/vhh;->c:J

    .line 57
    .line 58
    invoke-static/range {v0 .. v6}, La/yhh;->c(JJLa/ugd;La/fet;I)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
