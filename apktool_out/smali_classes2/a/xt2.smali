.class public final synthetic La/xt2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:F

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:F

.field public final synthetic g:Z

.field public final synthetic h:La/rv2;

.field public final synthetic i:La/ugd;

.field public final synthetic j:La/ugd;

.field public final synthetic k:I

.field public final synthetic l:S


# direct methods
.method public synthetic constructor <init>(La/mm40;FJJJFZLa/rv2;La/ugd;La/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xt2;->a:La/mm40;

    iput p2, p0, La/xt2;->b:F

    iput-wide p3, p0, La/xt2;->c:J

    iput-wide p5, p0, La/xt2;->d:J

    iput-wide p7, p0, La/xt2;->e:J

    iput p9, p0, La/xt2;->f:F

    iput-boolean p10, p0, La/xt2;->g:Z

    iput-object p11, p0, La/xt2;->h:La/rv2;

    iput-object p12, p0, La/xt2;->i:La/ugd;

    iput-object p13, p0, La/xt2;->j:La/ugd;

    iput p14, p0, La/xt2;->k:I

    iput-short p15, p0, La/xt2;->l:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    check-cast v13, La/fet;

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
    iget v1, v0, La/xt2;->k:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v14

    .line 22
    iget-object v1, v0, La/xt2;->a:La/mm40;

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    iget v1, v0, La/xt2;->b:F

    .line 26
    .line 27
    move-object v4, v2

    .line 28
    iget-wide v2, v0, La/xt2;->c:J

    .line 29
    .line 30
    move-object v6, v4

    .line 31
    iget-wide v4, v0, La/xt2;->d:J

    .line 32
    .line 33
    move-object v8, v6

    .line 34
    iget-wide v6, v0, La/xt2;->e:J

    .line 35
    .line 36
    move-object v9, v8

    .line 37
    iget v8, v0, La/xt2;->f:F

    .line 38
    .line 39
    move-object v10, v9

    .line 40
    iget-boolean v9, v0, La/xt2;->g:Z

    .line 41
    .line 42
    move-object v11, v10

    .line 43
    iget-object v10, v0, La/xt2;->h:La/rv2;

    .line 44
    .line 45
    move-object v12, v11

    .line 46
    iget-object v11, v0, La/xt2;->i:La/ugd;

    .line 47
    .line 48
    move-object v15, v12

    .line 49
    iget-object v12, v0, La/xt2;->j:La/ugd;

    .line 50
    .line 51
    iget-short v0, v0, La/xt2;->l:S

    .line 52
    .line 53
    move-object/from16 v16, v15

    .line 54
    .line 55
    move v15, v0

    .line 56
    move-object/from16 v0, v16

    .line 57
    .line 58
    invoke-static/range {v0 .. v15}, La/y0x0;->d(La/mm40;FJJJFZLa/rv2;La/ugd;La/ugd;La/fet;II)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0
.end method
