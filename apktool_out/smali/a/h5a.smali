.class public final synthetic La/h5a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/cpv0;


# direct methods
.method public synthetic constructor <init>(La/cpv0;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/h5a;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h5a;->c:La/cpv0;

    iput-object p2, p0, La/h5a;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;La/cpv0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/h5a;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h5a;->b:Ljava/lang/String;

    iput-object p2, p0, La/h5a;->c:La/cpv0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/h5a;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/h5a;->c:La/cpv0;

    .line 4
    .line 5
    iget-object p0, p0, La/h5a;->b:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, La/cpv0;->c:Landroidx/work/impl/WorkDatabase;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v2, La/i5a;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v2, v0, p0, v1, v3}, La/i5a;-><init>(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;La/cpv0;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, La/aeg0;->p(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, v1, La/cpv0;->b:La/wsd;

    .line 25
    .line 26
    iget-object v1, v1, La/cpv0;->e:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, La/m2h0;->b(La/wsd;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    iget-object v0, v1, La/cpv0;->c:Landroidx/work/impl/WorkDatabase;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v2, La/i5a;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v2, v0, p0, v1, v3}, La/i5a;-><init>(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;La/cpv0;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, La/aeg0;->p(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    iget-object p0, v1, La/cpv0;->b:La/wsd;

    .line 49
    .line 50
    iget-object v1, v1, La/cpv0;->e:Ljava/util/List;

    .line 51
    .line 52
    invoke-static {p0, v0, v1}, La/m2h0;->b(La/wsd;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
