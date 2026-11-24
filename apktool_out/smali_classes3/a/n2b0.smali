.class public final La/n2b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/j2b0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/j2b0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n2b0;->a:B

    iput-object p1, p0, La/n2b0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/n2b0;->c:La/j2b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/n2b0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/n2b0;->c:La/j2b0;

    .line 4
    .line 5
    iget-object p0, p0, La/n2b0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/st0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/kch;

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    invoke-direct {v0, p0, p1, v1, v2}, La/kch;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 22
    .line 23
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, La/bjj;->a()V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, La/st0;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v0, La/x1b0;

    .line 39
    .line 40
    iget-wide v2, p1, La/st0;->a:J

    .line 41
    .line 42
    check-cast v1, La/g2b0;

    .line 43
    .line 44
    iget-object v1, v1, La/g2b0;->a:La/fza0;

    .line 45
    .line 46
    iget-object p1, p1, La/st0;->g:Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-direct {v0, v2, v3, v1, p1}, La/x1b0;-><init>(JLa/fza0;Ljava/lang/Integer;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
