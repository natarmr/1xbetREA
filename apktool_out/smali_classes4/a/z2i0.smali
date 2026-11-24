.class public final synthetic La/z2i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/phq0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/phq0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z2i0;->a:B

    iput-object p1, p0, La/z2i0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/z2i0;->c:La/phq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/z2i0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/z2i0;->c:La/phq0;

    .line 4
    .line 5
    iget-object p0, p0, La/z2i0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/d3i0;->n2:La/gle0;

    .line 11
    .line 12
    new-instance v0, La/w2i0;

    .line 13
    .line 14
    iget-byte v1, v1, La/phq0;->a:B

    .line 15
    .line 16
    invoke-direct {v0, v1}, La/w2i0;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    sget-object v0, La/d3i0;->n2:La/gle0;

    .line 26
    .line 27
    new-instance v0, La/w2i0;

    .line 28
    .line 29
    iget-byte v1, v1, La/phq0;->a:B

    .line 30
    .line 31
    invoke-direct {v0, v1}, La/w2i0;-><init>(I)V

    .line 32
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
