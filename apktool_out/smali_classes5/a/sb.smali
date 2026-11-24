.class public final synthetic La/sb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:La/xcz;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/util/List;La/xcz;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p5, 0x1

    iput-byte p5, p0, La/sb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sb;->b:La/mm40;

    iput-object p2, p0, La/sb;->c:Ljava/util/List;

    iput-object p3, p0, La/sb;->d:La/xcz;

    iput-object p4, p0, La/sb;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/xcz;Ljava/util/List;La/mm40;I)V
    .locals 0

    .line 2
    const/4 p5, 0x0

    iput-byte p5, p0, La/sb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sb;->e:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/sb;->d:La/xcz;

    iput-object p3, p0, La/sb;->c:Ljava/util/List;

    iput-object p4, p0, La/sb;->b:La/mm40;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/sb;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v2, p1

    .line 7
    check-cast v2, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x7

    .line 15
    invoke-static {p1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v3, p0, La/sb;->d:La/xcz;

    .line 20
    .line 21
    iget-object v4, p0, La/sb;->b:La/mm40;

    .line 22
    .line 23
    iget-object v5, p0, La/sb;->c:Ljava/util/List;

    .line 24
    .line 25
    iget-object v6, p0, La/sb;->e:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    invoke-static/range {v1 .. v6}, La/nia0;->S(ILa/fet;La/xcz;La/mm40;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    move-object v1, p1

    .line 34
    check-cast v1, La/fet;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/16 p1, 0xc01

    .line 42
    .line 43
    invoke-static {p1}, La/x8x;->L(I)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v2, p0, La/sb;->d:La/xcz;

    .line 48
    .line 49
    iget-object v3, p0, La/sb;->b:La/mm40;

    .line 50
    .line 51
    iget-object v4, p0, La/sb;->c:Ljava/util/List;

    .line 52
    .line 53
    iget-object v5, p0, La/sb;->e:Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    invoke-static/range {v0 .. v5}, La/wb;->v(ILa/fet;La/xcz;La/mm40;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
