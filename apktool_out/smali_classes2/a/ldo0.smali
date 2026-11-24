.class public final synthetic La/ldo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/ugd;

.field public final synthetic c:La/mm40;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:F

.field public final synthetic g:Lkotlin/jvm/functions/Function2;

.field public final synthetic h:La/ugd;

.field public final synthetic i:La/rah0;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(ILa/ugd;La/mm40;JJFLkotlin/jvm/functions/Function2;La/ugd;La/rah0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/ldo0;->a:I

    iput-object p2, p0, La/ldo0;->b:La/ugd;

    iput-object p3, p0, La/ldo0;->c:La/mm40;

    iput-wide p4, p0, La/ldo0;->d:J

    iput-wide p6, p0, La/ldo0;->e:J

    iput p8, p0, La/ldo0;->f:F

    iput-object p9, p0, La/ldo0;->g:Lkotlin/jvm/functions/Function2;

    iput-object p10, p0, La/ldo0;->h:La/ugd;

    iput-object p11, p0, La/ldo0;->i:La/rah0;

    iput p12, p0, La/ldo0;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v11, p1

    .line 2
    check-cast v11, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/ldo0;->j:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v12

    .line 17
    iget v0, p0, La/ldo0;->a:I

    .line 18
    .line 19
    iget-object v1, p0, La/ldo0;->b:La/ugd;

    .line 20
    .line 21
    iget-object v2, p0, La/ldo0;->c:La/mm40;

    .line 22
    .line 23
    iget-wide v3, p0, La/ldo0;->d:J

    .line 24
    .line 25
    iget-wide v5, p0, La/ldo0;->e:J

    .line 26
    .line 27
    iget v7, p0, La/ldo0;->f:F

    .line 28
    .line 29
    iget-object v8, p0, La/ldo0;->g:Lkotlin/jvm/functions/Function2;

    .line 30
    .line 31
    iget-object v9, p0, La/ldo0;->h:La/ugd;

    .line 32
    .line 33
    iget-object v10, p0, La/ldo0;->i:La/rah0;

    .line 34
    .line 35
    invoke-static/range {v0 .. v12}, La/hxm0;->e(ILa/ugd;La/mm40;JJFLkotlin/jvm/functions/Function2;La/ugd;La/rah0;La/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0
.end method
