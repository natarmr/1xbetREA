.class public final synthetic La/hta0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/cra0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/cra0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hta0;->a:B

    iput-object p1, p0, La/hta0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/hta0;->c:La/cra0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/hta0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/jqa0;

    .line 7
    .line 8
    iget-object v1, p0, La/hta0;->c:La/cra0;

    .line 9
    .line 10
    iget-wide v1, v1, La/cra0;->a:J

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, La/jqa0;-><init>(J)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/hta0;->b:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    new-instance v0, La/bqa0;

    .line 24
    .line 25
    iget-object v1, p0, La/hta0;->c:La/cra0;

    .line 26
    .line 27
    iget-wide v1, v1, La/cra0;->a:J

    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, La/bqa0;-><init>(J)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/hta0;->b:Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
