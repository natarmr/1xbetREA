.class public final synthetic La/o0z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/h1z;

.field public final synthetic b:Z

.field public final synthetic c:La/mdm;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:C


# direct methods
.method public synthetic constructor <init>(La/h1z;ZLa/mdm;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o0z;->a:La/h1z;

    iput-boolean p2, p0, La/o0z;->b:Z

    iput-object p3, p0, La/o0z;->c:La/mdm;

    iput-object p4, p0, La/o0z;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La/o0z;->e:Lkotlin/jvm/functions/Function0;

    iput-char p6, p0, La/o0z;->f:C

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-char p1, p0, La/o0z;->f:C

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, La/o0z;->a:La/h1z;

    .line 18
    .line 19
    iget-boolean v1, p0, La/o0z;->b:Z

    .line 20
    .line 21
    iget-object v2, p0, La/o0z;->c:La/mdm;

    .line 22
    .line 23
    iget-object v3, p0, La/o0z;->d:Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    iget-object v4, p0, La/o0z;->e:Lkotlin/jvm/functions/Function0;

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, La/azw;->w(La/h1z;ZLa/mdm;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method
