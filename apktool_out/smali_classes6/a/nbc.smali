.class public final synthetic La/nbc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:La/o0x;

.field public final synthetic c:F

.field public final synthetic d:J

.field public final synthetic e:Z

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:Ljava/lang/Integer;

.field public final synthetic i:Ljava/lang/Boolean;

.field public final synthetic j:Z

.field public final synthetic k:Lkotlin/jvm/functions/Function0;

.field public final synthetic l:La/xdr;

.field public final synthetic m:La/xdr;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La/o0x;FJZJJLjava/lang/Integer;Ljava/lang/Boolean;ZLkotlin/jvm/functions/Function0;La/xdr;La/xdr;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nbc;->a:Ljava/lang/String;

    iput-object p2, p0, La/nbc;->b:La/o0x;

    iput p3, p0, La/nbc;->c:F

    iput-wide p4, p0, La/nbc;->d:J

    iput-boolean p6, p0, La/nbc;->e:Z

    iput-wide p7, p0, La/nbc;->f:J

    iput-wide p9, p0, La/nbc;->g:J

    iput-object p11, p0, La/nbc;->h:Ljava/lang/Integer;

    iput-object p12, p0, La/nbc;->i:Ljava/lang/Boolean;

    iput-boolean p13, p0, La/nbc;->j:Z

    iput-object p14, p0, La/nbc;->k:Lkotlin/jvm/functions/Function0;

    iput-object p15, p0, La/nbc;->l:La/xdr;

    move-object/from16 p1, p16

    iput-object p1, p0, La/nbc;->m:La/xdr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v16, p1

    .line 4
    .line 5
    check-cast v16, La/fet;

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
    move-result v17

    .line 19
    iget-object v1, v0, La/nbc;->a:Ljava/lang/String;

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    iget-object v1, v0, La/nbc;->b:La/o0x;

    .line 23
    .line 24
    move-object v3, v2

    .line 25
    iget v2, v0, La/nbc;->c:F

    .line 26
    .line 27
    move-object v5, v3

    .line 28
    iget-wide v3, v0, La/nbc;->d:J

    .line 29
    .line 30
    move-object v6, v5

    .line 31
    iget-boolean v5, v0, La/nbc;->e:Z

    .line 32
    .line 33
    move-object v8, v6

    .line 34
    iget-wide v6, v0, La/nbc;->f:J

    .line 35
    .line 36
    move-object v10, v8

    .line 37
    iget-wide v8, v0, La/nbc;->g:J

    .line 38
    .line 39
    move-object v11, v10

    .line 40
    iget-object v10, v0, La/nbc;->h:Ljava/lang/Integer;

    .line 41
    .line 42
    move-object v12, v11

    .line 43
    iget-object v11, v0, La/nbc;->i:Ljava/lang/Boolean;

    .line 44
    .line 45
    move-object v13, v12

    .line 46
    iget-boolean v12, v0, La/nbc;->j:Z

    .line 47
    .line 48
    move-object v14, v13

    .line 49
    iget-object v13, v0, La/nbc;->k:Lkotlin/jvm/functions/Function0;

    .line 50
    .line 51
    move-object v15, v14

    .line 52
    iget-object v14, v0, La/nbc;->l:La/xdr;

    .line 53
    .line 54
    iget-object v0, v0, La/nbc;->m:La/xdr;

    .line 55
    .line 56
    move-object/from16 v18, v15

    .line 57
    .line 58
    move-object v15, v0

    .line 59
    move-object/from16 v0, v18

    .line 60
    .line 61
    invoke-static/range {v0 .. v17}, La/obc;->c(Ljava/lang/String;La/o0x;FJZJJLjava/lang/Integer;Ljava/lang/Boolean;ZLkotlin/jvm/functions/Function0;La/xdr;La/xdr;La/fet;I)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object v0
.end method
