.class public final synthetic La/pvv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:F

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;FJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/pvv;->a:La/mm40;

    iput-object p2, p0, La/pvv;->b:Ljava/lang/String;

    iput p3, p0, La/pvv;->c:F

    iput-wide p4, p0, La/pvv;->d:J

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
    const/4 p1, 0x7

    .line 10
    invoke-static {p1}, La/x8x;->L(I)I

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    iget-object v0, p0, La/pvv;->a:La/mm40;

    .line 15
    .line 16
    iget-object v1, p0, La/pvv;->b:Ljava/lang/String;

    .line 17
    .line 18
    iget v2, p0, La/pvv;->c:F

    .line 19
    .line 20
    iget-wide v3, p0, La/pvv;->d:J

    .line 21
    .line 22
    invoke-static/range {v0 .. v6}, La/hmw0;->F(La/mm40;Ljava/lang/String;FJLa/fet;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0
.end method
