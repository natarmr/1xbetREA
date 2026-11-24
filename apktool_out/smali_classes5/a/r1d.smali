.class public final synthetic La/r1d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:F

.field public final synthetic c:La/rv2;

.field public final synthetic d:La/l7m0;

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:F

.field public final synthetic i:La/l7m0;

.field public final synthetic j:La/ugd;

.field public final synthetic k:La/ugd;

.field public final synthetic l:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/mm40;FLa/rv2;La/l7m0;JJJFLa/l7m0;La/ugd;La/ugd;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/r1d;->a:La/mm40;

    iput p2, p0, La/r1d;->b:F

    iput-object p3, p0, La/r1d;->c:La/rv2;

    iput-object p4, p0, La/r1d;->d:La/l7m0;

    iput-wide p5, p0, La/r1d;->e:J

    iput-wide p7, p0, La/r1d;->f:J

    iput-wide p9, p0, La/r1d;->g:J

    iput p11, p0, La/r1d;->h:F

    iput-object p12, p0, La/r1d;->i:La/l7m0;

    iput-object p13, p0, La/r1d;->j:La/ugd;

    iput-object p14, p0, La/r1d;->k:La/ugd;

    iput-object p15, p0, La/r1d;->l:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    check-cast v15, La/fet;

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
    const v1, 0x180001

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result v16

    .line 21
    iget-object v1, v0, La/r1d;->a:La/mm40;

    .line 22
    .line 23
    move-object v2, v1

    .line 24
    iget v1, v0, La/r1d;->b:F

    .line 25
    .line 26
    move-object v3, v2

    .line 27
    iget-object v2, v0, La/r1d;->c:La/rv2;

    .line 28
    .line 29
    move-object v4, v3

    .line 30
    iget-object v3, v0, La/r1d;->d:La/l7m0;

    .line 31
    .line 32
    move-object v6, v4

    .line 33
    iget-wide v4, v0, La/r1d;->e:J

    .line 34
    .line 35
    move-object v8, v6

    .line 36
    iget-wide v6, v0, La/r1d;->f:J

    .line 37
    .line 38
    move-object v10, v8

    .line 39
    iget-wide v8, v0, La/r1d;->g:J

    .line 40
    .line 41
    move-object v11, v10

    .line 42
    iget v10, v0, La/r1d;->h:F

    .line 43
    .line 44
    move-object v12, v11

    .line 45
    iget-object v11, v0, La/r1d;->i:La/l7m0;

    .line 46
    .line 47
    move-object v13, v12

    .line 48
    iget-object v12, v0, La/r1d;->j:La/ugd;

    .line 49
    .line 50
    move-object v14, v13

    .line 51
    iget-object v13, v0, La/r1d;->k:La/ugd;

    .line 52
    .line 53
    iget-object v0, v0, La/r1d;->l:Lkotlin/jvm/functions/Function2;

    .line 54
    .line 55
    move-object/from16 v17, v14

    .line 56
    .line 57
    move-object v14, v0

    .line 58
    move-object/from16 v0, v17

    .line 59
    .line 60
    invoke-static/range {v0 .. v16}, La/gq80;->m(La/mm40;FLa/rv2;La/l7m0;JJJFLa/l7m0;La/ugd;La/ugd;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 61
    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0
.end method
