.class public final synthetic La/ita0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/dra0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/dra0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ita0;->a:B

    iput-object p1, p0, La/ita0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/ita0;->c:La/dra0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/ita0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ita0;->c:La/dra0;

    .line 4
    .line 5
    iget-object p0, p0, La/ita0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/jqa0;

    .line 11
    .line 12
    iget-wide v1, v1, La/dra0;->a:J

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, La/jqa0;-><init>(J)V

    .line 15
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
    new-instance v0, La/xqa0;

    .line 24
    .line 25
    move-object v3, v1

    .line 26
    iget-wide v1, v3, La/dra0;->a:J

    .line 27
    .line 28
    move-object v5, v3

    .line 29
    iget-wide v3, v5, La/dra0;->c:J

    .line 30
    .line 31
    move-object v6, v5

    .line 32
    iget-object v5, v6, La/dra0;->h:La/yi00;

    .line 33
    .line 34
    iget-object v6, v6, La/dra0;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-direct/range {v0 .. v6}, La/xqa0;-><init>(JJLa/yi00;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
