.class public final synthetic La/mfc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/pfc0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/pfc0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mfc0;->a:B

    iput-object p1, p0, La/mfc0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/mfc0;->c:La/pfc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mfc0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/mfc0;->c:La/pfc0;

    .line 4
    .line 5
    iget-object p0, p0, La/mfc0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    check-cast p1, La/jly;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p1, La/d9f0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, La/u0f0;->u:La/u0f0;

    .line 21
    .line 22
    invoke-direct {p1, v0}, La/d9f0;-><init>(La/u0f0;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance p1, La/b9f0;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v0, La/u0f0;->u:La/u0f0;

    .line 37
    .line 38
    invoke-direct {p1, v0}, La/b9f0;-><init>(La/u0f0;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
