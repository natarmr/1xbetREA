.class public final synthetic La/cq8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:La/lel;

.field public final synthetic i:J

.field public final synthetic j:La/xdr;

.field public final synthetic k:La/xdr;

.field public final synthetic l:La/xdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;ZZZZZLa/lel;JLa/xdr;La/xdr;La/xdr;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cq8;->a:La/mm40;

    iput-object p2, p0, La/cq8;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iput-boolean p3, p0, La/cq8;->c:Z

    iput-boolean p4, p0, La/cq8;->d:Z

    iput-boolean p5, p0, La/cq8;->e:Z

    iput-boolean p6, p0, La/cq8;->f:Z

    iput-boolean p7, p0, La/cq8;->g:Z

    iput-object p8, p0, La/cq8;->h:La/lel;

    iput-wide p9, p0, La/cq8;->i:J

    iput-object p11, p0, La/cq8;->j:La/xdr;

    iput-object p12, p0, La/cq8;->k:La/xdr;

    iput-object p13, p0, La/cq8;->l:La/xdr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

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
    const/4 v1, 0x1

    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v14

    .line 19
    iget-object v1, v0, La/cq8;->a:La/mm40;

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    iget-object v1, v0, La/cq8;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 23
    .line 24
    move-object v3, v2

    .line 25
    iget-boolean v2, v0, La/cq8;->c:Z

    .line 26
    .line 27
    move-object v4, v3

    .line 28
    iget-boolean v3, v0, La/cq8;->d:Z

    .line 29
    .line 30
    move-object v5, v4

    .line 31
    iget-boolean v4, v0, La/cq8;->e:Z

    .line 32
    .line 33
    move-object v6, v5

    .line 34
    iget-boolean v5, v0, La/cq8;->f:Z

    .line 35
    .line 36
    move-object v7, v6

    .line 37
    iget-boolean v6, v0, La/cq8;->g:Z

    .line 38
    .line 39
    move-object v8, v7

    .line 40
    iget-object v7, v0, La/cq8;->h:La/lel;

    .line 41
    .line 42
    move-object v10, v8

    .line 43
    iget-wide v8, v0, La/cq8;->i:J

    .line 44
    .line 45
    move-object v11, v10

    .line 46
    iget-object v10, v0, La/cq8;->j:La/xdr;

    .line 47
    .line 48
    move-object v12, v11

    .line 49
    iget-object v11, v0, La/cq8;->k:La/xdr;

    .line 50
    .line 51
    iget-object v0, v0, La/cq8;->l:La/xdr;

    .line 52
    .line 53
    move-object v15, v12

    .line 54
    move-object v12, v0

    .line 55
    move-object v0, v15

    .line 56
    invoke-static/range {v0 .. v14}, La/i4w0;->j(La/mm40;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;ZZZZZLa/lel;JLa/xdr;La/xdr;La/xdr;La/fet;I)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0
.end method
