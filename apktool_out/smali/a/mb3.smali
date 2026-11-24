.class public final synthetic La/mb3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/ilq;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:La/ugd;

.field public final synthetic h:La/y9q0;

.field public final synthetic i:La/y9q0;

.field public final synthetic j:Lkotlin/jvm/functions/Function0;

.field public final synthetic k:La/ugd;

.field public final synthetic l:La/ugd;

.field public final synthetic m:F


# direct methods
.method public synthetic constructor <init>(La/mm40;La/ilq;JJJJLa/ugd;La/y9q0;La/y9q0;Lkotlin/jvm/functions/Function0;La/ugd;La/ugd;FI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mb3;->a:La/mm40;

    iput-object p2, p0, La/mb3;->b:La/ilq;

    iput-wide p3, p0, La/mb3;->c:J

    iput-wide p5, p0, La/mb3;->d:J

    iput-wide p7, p0, La/mb3;->e:J

    iput-wide p9, p0, La/mb3;->f:J

    iput-object p11, p0, La/mb3;->g:La/ugd;

    iput-object p12, p0, La/mb3;->h:La/y9q0;

    iput-object p13, p0, La/mb3;->i:La/y9q0;

    iput-object p14, p0, La/mb3;->j:Lkotlin/jvm/functions/Function0;

    iput-object p15, p0, La/mb3;->k:La/ugd;

    move-object/from16 p1, p16

    iput-object p1, p0, La/mb3;->l:La/ugd;

    move/from16 p1, p17

    iput p1, p0, La/mb3;->m:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v17, p1

    .line 4
    .line 5
    check-cast v17, La/fet;

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
    const/4 v1, 0x1

    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v18

    .line 19
    iget-object v1, v0, La/mb3;->a:La/mm40;

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    iget-object v1, v0, La/mb3;->b:La/ilq;

    .line 23
    .line 24
    move-object v4, v2

    .line 25
    iget-wide v2, v0, La/mb3;->c:J

    .line 26
    .line 27
    move-object v6, v4

    .line 28
    iget-wide v4, v0, La/mb3;->d:J

    .line 29
    .line 30
    move-object v8, v6

    .line 31
    iget-wide v6, v0, La/mb3;->e:J

    .line 32
    .line 33
    move-object v10, v8

    .line 34
    iget-wide v8, v0, La/mb3;->f:J

    .line 35
    .line 36
    move-object v11, v10

    .line 37
    iget-object v10, v0, La/mb3;->g:La/ugd;

    .line 38
    .line 39
    move-object v12, v11

    .line 40
    iget-object v11, v0, La/mb3;->h:La/y9q0;

    .line 41
    .line 42
    move-object v13, v12

    .line 43
    iget-object v12, v0, La/mb3;->i:La/y9q0;

    .line 44
    .line 45
    move-object v14, v13

    .line 46
    iget-object v13, v0, La/mb3;->j:Lkotlin/jvm/functions/Function0;

    .line 47
    .line 48
    move-object v15, v14

    .line 49
    iget-object v14, v0, La/mb3;->k:La/ugd;

    .line 50
    .line 51
    move-object/from16 v16, v15

    .line 52
    .line 53
    iget-object v15, v0, La/mb3;->l:La/ugd;

    .line 54
    .line 55
    iget v0, v0, La/mb3;->m:F

    .line 56
    .line 57
    move-object/from16 v19, v16

    .line 58
    .line 59
    move/from16 v16, v0

    .line 60
    .line 61
    move-object/from16 v0, v19

    .line 62
    .line 63
    invoke-static/range {v0 .. v18}, La/ob3;->c(La/mm40;La/ilq;JJJJLa/ugd;La/y9q0;La/y9q0;Lkotlin/jvm/functions/Function0;La/ugd;La/ugd;FLa/fet;I)V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object v0
.end method
