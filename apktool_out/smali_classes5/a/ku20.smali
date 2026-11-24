.class public final synthetic La/ku20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/f07;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/f07;JB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ku20;->a:B

    iput-object p1, p0, La/ku20;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/ku20;->c:La/f07;

    iput-wide p3, p0, La/ku20;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/ku20;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/jy20;

    .line 7
    .line 8
    new-instance v1, La/c130;

    .line 9
    .line 10
    iget-object v2, p0, La/ku20;->c:La/f07;

    .line 11
    .line 12
    iget-wide v3, p0, La/ku20;->d:J

    .line 13
    .line 14
    invoke-direct {v1, v2, v3, v4}, La/c130;-><init>(La/f07;J)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, La/jy20;-><init>(La/g130;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/ku20;->b:Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    new-instance v0, La/ku20;

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    iget-object v1, p0, La/ku20;->b:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    iget-object v2, p0, La/ku20;->c:La/f07;

    .line 34
    .line 35
    iget-wide v3, p0, La/ku20;->d:J

    .line 36
    .line 37
    invoke-direct/range {v0 .. v5}, La/ku20;-><init>(Lkotlin/jvm/functions/Function1;La/f07;JB)V

    .line 38
    .line 39
    .line 40
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 41
    .line 42
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, La/bjj;->a()V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
