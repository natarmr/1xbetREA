.class public final synthetic La/i5l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/amw;


# direct methods
.method public synthetic constructor <init>(La/amw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i5l;->a:B

    iput-object p1, p0, La/i5l;->b:La/amw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i5l;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/i5l;->b:La/amw;

    .line 4
    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, La/j7l;

    .line 14
    .line 15
    invoke-direct {v0, p1}, La/j7l;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, La/j7l;->setScrollViewKeeper(La/amw;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, La/m5l;

    .line 26
    .line 27
    invoke-direct {v0, p1}, La/m5l;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, La/m5l;->setScrollViewKeeper(La/amw;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
