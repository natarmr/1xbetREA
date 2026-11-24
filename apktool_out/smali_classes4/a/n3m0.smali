.class public final synthetic La/n3m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p010;

.field public final synthetic c:J

.field public final synthetic d:La/dp20;


# direct methods
.method public synthetic constructor <init>(La/p010;JLa/dp20;IB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/n3m0;->a:B

    iput-object p1, p0, La/n3m0;->b:La/p010;

    iput-wide p2, p0, La/n3m0;->c:J

    iput-object p4, p0, La/n3m0;->d:La/dp20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/n3m0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object v6, p1

    .line 8
    check-cast v6, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v2, p0, La/n3m0;->b:La/p010;

    .line 20
    .line 21
    iget-wide v3, p0, La/n3m0;->c:J

    .line 22
    .line 23
    iget-object v5, p0, La/n3m0;->d:La/dp20;

    .line 24
    .line 25
    invoke-static/range {v2 .. v7}, La/r3m0;->e(La/p010;JLa/dp20;La/fet;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    move-object v4, p1

    .line 32
    check-cast v4, La/fet;

    .line 33
    .line 34
    check-cast p2, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, La/x8x;->L(I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    iget-object v0, p0, La/n3m0;->b:La/p010;

    .line 44
    .line 45
    iget-wide v1, p0, La/n3m0;->c:J

    .line 46
    .line 47
    iget-object v3, p0, La/n3m0;->d:La/dp20;

    .line 48
    .line 49
    invoke-static/range {v0 .. v5}, La/r3m0;->e(La/p010;JLa/dp20;La/fet;I)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
