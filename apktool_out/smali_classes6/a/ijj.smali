.class public final La/ijj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/pz40;

.field public final synthetic f:La/pz40;

.field public final synthetic g:La/pz40;

.field public final synthetic h:La/pz40;

.field public final synthetic i:La/pz40;

.field public final synthetic j:La/pz40;

.field public final synthetic k:J

.field public final synthetic l:La/pz40;

.field public final synthetic m:La/pz40;


# direct methods
.method public constructor <init>(FFLa/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;JLa/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/ijj;->a:F

    .line 5
    .line 6
    iput p2, p0, La/ijj;->b:F

    .line 7
    .line 8
    iput-object p3, p0, La/ijj;->c:La/pz40;

    .line 9
    .line 10
    iput-object p4, p0, La/ijj;->d:La/pz40;

    .line 11
    .line 12
    iput-object p5, p0, La/ijj;->e:La/pz40;

    .line 13
    .line 14
    iput-object p6, p0, La/ijj;->f:La/pz40;

    .line 15
    .line 16
    iput-object p7, p0, La/ijj;->g:La/pz40;

    .line 17
    .line 18
    iput-object p8, p0, La/ijj;->h:La/pz40;

    .line 19
    .line 20
    iput-object p9, p0, La/ijj;->i:La/pz40;

    .line 21
    .line 22
    iput-object p10, p0, La/ijj;->j:La/pz40;

    .line 23
    .line 24
    iput-wide p11, p0, La/ijj;->k:J

    .line 25
    .line 26
    iput-object p13, p0, La/ijj;->l:La/pz40;

    .line 27
    .line 28
    iput-object p14, p0, La/ijj;->m:La/pz40;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/hjj;

    .line 4
    .line 5
    iget-object v14, v0, La/ijj;->m:La/pz40;

    .line 6
    .line 7
    const/4 v15, 0x0

    .line 8
    move-object v2, v1

    .line 9
    iget v1, v0, La/ijj;->a:F

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    iget v2, v0, La/ijj;->b:F

    .line 13
    .line 14
    move-object v4, v3

    .line 15
    iget-object v3, v0, La/ijj;->c:La/pz40;

    .line 16
    .line 17
    move-object v5, v4

    .line 18
    iget-object v4, v0, La/ijj;->d:La/pz40;

    .line 19
    .line 20
    move-object v6, v5

    .line 21
    iget-object v5, v0, La/ijj;->e:La/pz40;

    .line 22
    .line 23
    move-object v7, v6

    .line 24
    iget-object v6, v0, La/ijj;->f:La/pz40;

    .line 25
    .line 26
    move-object v8, v7

    .line 27
    iget-object v7, v0, La/ijj;->g:La/pz40;

    .line 28
    .line 29
    move-object v9, v8

    .line 30
    iget-object v8, v0, La/ijj;->h:La/pz40;

    .line 31
    .line 32
    move-object v10, v9

    .line 33
    iget-object v9, v0, La/ijj;->i:La/pz40;

    .line 34
    .line 35
    move-object v11, v10

    .line 36
    iget-object v10, v0, La/ijj;->j:La/pz40;

    .line 37
    .line 38
    move-object v13, v11

    .line 39
    iget-wide v11, v0, La/ijj;->k:J

    .line 40
    .line 41
    iget-object v0, v0, La/ijj;->l:La/pz40;

    .line 42
    .line 43
    move-object/from16 v16, v13

    .line 44
    .line 45
    move-object v13, v0

    .line 46
    move-object/from16 v0, v16

    .line 47
    .line 48
    invoke-direct/range {v0 .. v15}, La/hjj;-><init>(FFLa/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;JLa/pz40;La/pz40;La/yje;)V

    .line 49
    .line 50
    .line 51
    move-object v13, v0

    .line 52
    move-object/from16 v0, p1

    .line 53
    .line 54
    check-cast v0, La/jnn0;

    .line 55
    .line 56
    move-object/from16 v1, p2

    .line 57
    .line 58
    invoke-virtual {v0, v1, v13}, La/jnn0;->Z0(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, La/wne;->a:La/wne;

    .line 63
    .line 64
    if-ne v0, v1, :cond_0

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object v0
.end method
