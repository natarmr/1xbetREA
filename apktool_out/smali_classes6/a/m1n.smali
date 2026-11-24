.class public final synthetic La/m1n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:La/i1n;

.field public final synthetic e:La/i1n;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/i1n;La/i1n;Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/m1n;->a:B

    sget-object v0, La/x0m;->a:La/x0m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m1n;->b:La/mm40;

    iput-object p2, p0, La/m1n;->d:La/i1n;

    iput-object p3, p0, La/m1n;->e:La/i1n;

    iput-object p4, p0, La/m1n;->c:Ljava/lang/String;

    iput p5, p0, La/m1n;->f:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;La/i1n;La/i1n;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/m1n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m1n;->b:La/mm40;

    iput-object p2, p0, La/m1n;->c:Ljava/lang/String;

    iput-object p3, p0, La/m1n;->d:La/i1n;

    iput-object p4, p0, La/m1n;->e:La/i1n;

    iput p5, p0, La/m1n;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/m1n;->a:B

    .line 2
    .line 3
    iget v1, p0, La/m1n;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v5, p1

    .line 9
    check-cast v5, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    or-int/lit8 p1, v1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget-object v3, p0, La/m1n;->d:La/i1n;

    .line 23
    .line 24
    iget-object v4, p0, La/m1n;->e:La/i1n;

    .line 25
    .line 26
    iget-object v6, p0, La/m1n;->b:La/mm40;

    .line 27
    .line 28
    iget-object v7, p0, La/m1n;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static/range {v2 .. v7}, La/d5c;->y(ILa/i1n;La/i1n;La/fet;La/mm40;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    sget-object v0, La/x0m;->a:La/x0m;

    .line 37
    .line 38
    move-object v5, p1

    .line 39
    check-cast v5, La/fet;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    or-int/lit8 p1, v1, 0x1

    .line 47
    .line 48
    invoke-static {p1}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget-object v3, p0, La/m1n;->d:La/i1n;

    .line 53
    .line 54
    iget-object v4, p0, La/m1n;->e:La/i1n;

    .line 55
    .line 56
    iget-object v6, p0, La/m1n;->b:La/mm40;

    .line 57
    .line 58
    iget-object v7, p0, La/m1n;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static/range {v2 .. v7}, La/d5c;->w(ILa/i1n;La/i1n;La/fet;La/mm40;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
