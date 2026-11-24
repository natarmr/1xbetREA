.class public final synthetic La/hxr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/nsm0;

.field public final synthetic b:La/pwr0;

.field public final synthetic c:La/k6z;

.field public final synthetic d:J

.field public final synthetic e:La/o6s0;

.field public final synthetic f:I

.field public final synthetic g:Lkotlin/jvm/functions/Function2;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/nsm0;La/pwr0;La/k6z;JLa/o6s0;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hxr0;->a:La/nsm0;

    iput-object p2, p0, La/hxr0;->b:La/pwr0;

    iput-object p3, p0, La/hxr0;->c:La/k6z;

    iput-wide p4, p0, La/hxr0;->d:J

    iput-object p6, p0, La/hxr0;->e:La/o6s0;

    iput p7, p0, La/hxr0;->f:I

    iput-object p8, p0, La/hxr0;->g:Lkotlin/jvm/functions/Function2;

    iput-object p9, p0, La/hxr0;->h:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, La/hxr0;->i:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, La/hxr0;->j:Lkotlin/jvm/functions/Function1;

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
    const/4 p1, 0x7

    .line 10
    invoke-static {p1}, La/x8x;->L(I)I

    .line 11
    .line 12
    .line 13
    move-result v12

    .line 14
    iget-object v0, p0, La/hxr0;->a:La/nsm0;

    .line 15
    .line 16
    iget-object v1, p0, La/hxr0;->b:La/pwr0;

    .line 17
    .line 18
    iget-object v2, p0, La/hxr0;->c:La/k6z;

    .line 19
    .line 20
    iget-wide v3, p0, La/hxr0;->d:J

    .line 21
    .line 22
    iget-object v5, p0, La/hxr0;->e:La/o6s0;

    .line 23
    .line 24
    iget v6, p0, La/hxr0;->f:I

    .line 25
    .line 26
    iget-object v7, p0, La/hxr0;->g:Lkotlin/jvm/functions/Function2;

    .line 27
    .line 28
    iget-object v8, p0, La/hxr0;->h:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    iget-object v9, p0, La/hxr0;->i:Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    iget-object v10, p0, La/hxr0;->j:Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    invoke-static/range {v0 .. v12}, La/iom0;->c(La/nsm0;La/pwr0;La/k6z;JLa/o6s0;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0
.end method
