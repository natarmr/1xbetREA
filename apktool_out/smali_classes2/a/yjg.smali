.class public final synthetic La/yjg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g5h;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/qdz;

.field public final synthetic e:La/l7m0;

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:La/xcz;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(La/g5h;La/pz40;La/qdz;La/l7m0;ZZLa/xcz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p11, p0, La/yjg;->a:B

    iput-object p1, p0, La/yjg;->b:La/g5h;

    iput-object p2, p0, La/yjg;->c:La/pz40;

    iput-object p3, p0, La/yjg;->d:La/qdz;

    iput-object p4, p0, La/yjg;->e:La/l7m0;

    iput-boolean p5, p0, La/yjg;->f:Z

    iput-boolean p6, p0, La/yjg;->g:Z

    iput-object p7, p0, La/yjg;->h:La/xcz;

    iput-object p8, p0, La/yjg;->i:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, La/yjg;->j:Lkotlin/jvm/functions/Function1;

    iput p10, p0, La/yjg;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/yjg;->a:B

    .line 2
    .line 3
    iget v1, p0, La/yjg;->k:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v11, p1

    .line 9
    check-cast v11, La/fet;

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
    move-result v12

    .line 22
    iget-object v2, p0, La/yjg;->b:La/g5h;

    .line 23
    .line 24
    iget-object v3, p0, La/yjg;->c:La/pz40;

    .line 25
    .line 26
    iget-object v4, p0, La/yjg;->d:La/qdz;

    .line 27
    .line 28
    iget-object v5, p0, La/yjg;->e:La/l7m0;

    .line 29
    .line 30
    iget-boolean v6, p0, La/yjg;->f:Z

    .line 31
    .line 32
    iget-boolean v7, p0, La/yjg;->g:Z

    .line 33
    .line 34
    iget-object v8, p0, La/yjg;->h:La/xcz;

    .line 35
    .line 36
    iget-object v9, p0, La/yjg;->i:Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    iget-object v10, p0, La/yjg;->j:Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    invoke-static/range {v2 .. v12}, La/cfx0;->u(La/g5h;La/pz40;La/qdz;La/l7m0;ZZLa/xcz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    move-object v9, p1

    .line 47
    check-cast v9, La/fet;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    or-int/lit8 p1, v1, 0x1

    .line 55
    .line 56
    invoke-static {p1}, La/x8x;->L(I)I

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    iget-object v0, p0, La/yjg;->b:La/g5h;

    .line 61
    .line 62
    iget-object v1, p0, La/yjg;->c:La/pz40;

    .line 63
    .line 64
    iget-object v2, p0, La/yjg;->d:La/qdz;

    .line 65
    .line 66
    iget-object v3, p0, La/yjg;->e:La/l7m0;

    .line 67
    .line 68
    iget-boolean v4, p0, La/yjg;->f:Z

    .line 69
    .line 70
    iget-boolean v5, p0, La/yjg;->g:Z

    .line 71
    .line 72
    iget-object v6, p0, La/yjg;->h:La/xcz;

    .line 73
    .line 74
    iget-object v7, p0, La/yjg;->i:Lkotlin/jvm/functions/Function1;

    .line 75
    .line 76
    iget-object v8, p0, La/yjg;->j:Lkotlin/jvm/functions/Function1;

    .line 77
    .line 78
    invoke-static/range {v0 .. v10}, La/ntr;->P(La/g5h;La/pz40;La/qdz;La/l7m0;ZZLa/xcz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
