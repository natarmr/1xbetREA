.class public final synthetic La/ps8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/a1m0;

.field public final synthetic c:La/xcz;

.field public final synthetic d:Z

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:La/ydr;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:Lkotlin/jvm/functions/Function1;

.field public final synthetic l:La/xdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a1m0;La/xcz;ZJJLkotlin/jvm/functions/Function0;La/ydr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/xdr;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ps8;->a:La/mm40;

    iput-object p2, p0, La/ps8;->b:La/a1m0;

    iput-object p3, p0, La/ps8;->c:La/xcz;

    iput-boolean p4, p0, La/ps8;->d:Z

    iput-wide p5, p0, La/ps8;->e:J

    iput-wide p7, p0, La/ps8;->f:J

    iput-object p9, p0, La/ps8;->g:Lkotlin/jvm/functions/Function0;

    iput-object p10, p0, La/ps8;->h:La/ydr;

    iput-object p11, p0, La/ps8;->i:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, La/ps8;->j:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, La/ps8;->k:Lkotlin/jvm/functions/Function1;

    iput-object p14, p0, La/ps8;->l:La/xdr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    check-cast v14, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const v1, 0x1801c1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result v15

    .line 21
    iget-object v1, v0, La/ps8;->a:La/mm40;

    .line 22
    .line 23
    move-object v2, v1

    .line 24
    iget-object v1, v0, La/ps8;->b:La/a1m0;

    .line 25
    .line 26
    move-object v3, v2

    .line 27
    iget-object v2, v0, La/ps8;->c:La/xcz;

    .line 28
    .line 29
    move-object v4, v3

    .line 30
    iget-boolean v3, v0, La/ps8;->d:Z

    .line 31
    .line 32
    move-object v6, v4

    .line 33
    iget-wide v4, v0, La/ps8;->e:J

    .line 34
    .line 35
    move-object v8, v6

    .line 36
    iget-wide v6, v0, La/ps8;->f:J

    .line 37
    .line 38
    move-object v9, v8

    .line 39
    iget-object v8, v0, La/ps8;->g:Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    move-object v10, v9

    .line 42
    iget-object v9, v0, La/ps8;->h:La/ydr;

    .line 43
    .line 44
    move-object v11, v10

    .line 45
    iget-object v10, v0, La/ps8;->i:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    move-object v12, v11

    .line 48
    iget-object v11, v0, La/ps8;->j:Lkotlin/jvm/functions/Function1;

    .line 49
    .line 50
    move-object v13, v12

    .line 51
    iget-object v12, v0, La/ps8;->k:Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    iget-object v0, v0, La/ps8;->l:La/xdr;

    .line 54
    .line 55
    move-object/from16 v16, v13

    .line 56
    .line 57
    move-object v13, v0

    .line 58
    move-object/from16 v0, v16

    .line 59
    .line 60
    invoke-static/range {v0 .. v15}, La/cfx0;->d(La/mm40;La/a1m0;La/xcz;ZJJLkotlin/jvm/functions/Function0;La/ydr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/xdr;La/fet;I)V

    .line 61
    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0
.end method
