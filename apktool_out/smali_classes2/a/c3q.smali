.class public final synthetic La/c3q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/mm40;JJLkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/c3q;->a:B

    iput-object p1, p0, La/c3q;->b:La/mm40;

    iput-wide p2, p0, La/c3q;->c:J

    iput-wide p4, p0, La/c3q;->d:J

    iput-object p6, p0, La/c3q;->e:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/c3q;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v7, p1

    .line 7
    check-cast v7, La/fet;

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
    move-result v8

    .line 19
    iget-object v1, p0, La/c3q;->b:La/mm40;

    .line 20
    .line 21
    iget-wide v2, p0, La/c3q;->c:J

    .line 22
    .line 23
    iget-wide v4, p0, La/c3q;->d:J

    .line 24
    .line 25
    iget-object v6, p0, La/c3q;->e:Lkotlin/jvm/functions/Function0;

    .line 26
    .line 27
    invoke-static/range {v1 .. v8}, La/hkb;->u(La/mm40;JJLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    move-object v6, p1

    .line 34
    check-cast v6, La/fet;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    invoke-static {p1}, La/x8x;->L(I)I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    iget-object v0, p0, La/c3q;->b:La/mm40;

    .line 47
    .line 48
    iget-wide v1, p0, La/c3q;->c:J

    .line 49
    .line 50
    iget-wide v3, p0, La/c3q;->d:J

    .line 51
    .line 52
    iget-object v5, p0, La/c3q;->e:Lkotlin/jvm/functions/Function0;

    .line 53
    .line 54
    invoke-static/range {v0 .. v7}, La/obc;->w(La/mm40;JJLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
