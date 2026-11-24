.class public final synthetic La/wjg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g5h;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:La/xcz;

.field public final synthetic g:La/qdz;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/g5h;La/l7m0;ZZLa/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p10, p0, La/wjg;->a:B

    iput-object p1, p0, La/wjg;->b:La/g5h;

    iput-object p2, p0, La/wjg;->c:La/l7m0;

    iput-boolean p3, p0, La/wjg;->d:Z

    iput-boolean p4, p0, La/wjg;->e:Z

    iput-object p5, p0, La/wjg;->f:La/xcz;

    iput-object p6, p0, La/wjg;->g:La/qdz;

    iput-object p7, p0, La/wjg;->h:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, La/wjg;->i:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/wjg;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object v10, p1

    .line 8
    check-cast v10, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v11

    .line 19
    iget-object v2, p0, La/wjg;->b:La/g5h;

    .line 20
    .line 21
    iget-object v3, p0, La/wjg;->c:La/l7m0;

    .line 22
    .line 23
    iget-boolean v4, p0, La/wjg;->d:Z

    .line 24
    .line 25
    iget-boolean v5, p0, La/wjg;->e:Z

    .line 26
    .line 27
    iget-object v6, p0, La/wjg;->f:La/xcz;

    .line 28
    .line 29
    iget-object v7, p0, La/wjg;->g:La/qdz;

    .line 30
    .line 31
    iget-object v8, p0, La/wjg;->h:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    iget-object v9, p0, La/wjg;->i:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    invoke-static/range {v2 .. v11}, La/cfx0;->q(La/g5h;La/l7m0;ZZLa/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    move-object v8, p1

    .line 42
    check-cast v8, La/fet;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, La/x8x;->L(I)I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    iget-object v0, p0, La/wjg;->b:La/g5h;

    .line 54
    .line 55
    iget-object v1, p0, La/wjg;->c:La/l7m0;

    .line 56
    .line 57
    iget-boolean v2, p0, La/wjg;->d:Z

    .line 58
    .line 59
    iget-boolean v3, p0, La/wjg;->e:Z

    .line 60
    .line 61
    iget-object v4, p0, La/wjg;->f:La/xcz;

    .line 62
    .line 63
    iget-object v5, p0, La/wjg;->g:La/qdz;

    .line 64
    .line 65
    iget-object v6, p0, La/wjg;->h:Lkotlin/jvm/functions/Function1;

    .line 66
    .line 67
    iget-object v7, p0, La/wjg;->i:Lkotlin/jvm/functions/Function1;

    .line 68
    .line 69
    invoke-static/range {v0 .. v9}, La/ntr;->K(La/g5h;La/l7m0;ZZLa/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
