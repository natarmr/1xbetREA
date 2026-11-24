.class public final synthetic La/whl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/iil0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/l7m0;

.field public final synthetic e:La/l7m0;

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:J

.field public final synthetic i:Lkotlin/jvm/functions/Function0;

.field public final synthetic j:Lkotlin/jvm/functions/Function0;

.field public final synthetic k:La/ugd;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/iil0;La/l7m0;La/l7m0;La/l7m0;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/whl0;->a:La/mm40;

    iput-object p2, p0, La/whl0;->b:La/iil0;

    iput-object p3, p0, La/whl0;->c:La/l7m0;

    iput-object p4, p0, La/whl0;->d:La/l7m0;

    iput-object p5, p0, La/whl0;->e:La/l7m0;

    iput-wide p6, p0, La/whl0;->f:J

    iput-wide p8, p0, La/whl0;->g:J

    iput-wide p10, p0, La/whl0;->h:J

    iput-object p12, p0, La/whl0;->i:Lkotlin/jvm/functions/Function0;

    iput-object p13, p0, La/whl0;->j:Lkotlin/jvm/functions/Function0;

    iput-object p14, p0, La/whl0;->k:La/ugd;

    iput p15, p0, La/whl0;->l:I

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
    iget v1, v0, La/whl0;->l:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v15

    .line 22
    iget-object v1, v0, La/whl0;->a:La/mm40;

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    iget-object v1, v0, La/whl0;->b:La/iil0;

    .line 26
    .line 27
    move-object v3, v2

    .line 28
    iget-object v2, v0, La/whl0;->c:La/l7m0;

    .line 29
    .line 30
    move-object v4, v3

    .line 31
    iget-object v3, v0, La/whl0;->d:La/l7m0;

    .line 32
    .line 33
    move-object v5, v4

    .line 34
    iget-object v4, v0, La/whl0;->e:La/l7m0;

    .line 35
    .line 36
    move-object v7, v5

    .line 37
    iget-wide v5, v0, La/whl0;->f:J

    .line 38
    .line 39
    move-object v9, v7

    .line 40
    iget-wide v7, v0, La/whl0;->g:J

    .line 41
    .line 42
    move-object v11, v9

    .line 43
    iget-wide v9, v0, La/whl0;->h:J

    .line 44
    .line 45
    move-object v12, v11

    .line 46
    iget-object v11, v0, La/whl0;->i:Lkotlin/jvm/functions/Function0;

    .line 47
    .line 48
    move-object v13, v12

    .line 49
    iget-object v12, v0, La/whl0;->j:Lkotlin/jvm/functions/Function0;

    .line 50
    .line 51
    iget-object v0, v0, La/whl0;->k:La/ugd;

    .line 52
    .line 53
    move-object/from16 v16, v13

    .line 54
    .line 55
    move-object v13, v0

    .line 56
    move-object/from16 v0, v16

    .line 57
    .line 58
    invoke-static/range {v0 .. v15}, La/q8x;->d(La/mm40;La/iil0;La/l7m0;La/l7m0;La/l7m0;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0
.end method
