.class public final synthetic La/xub0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zy3;
.implements La/eer;


# instance fields
.field public final synthetic a:La/zub0;


# direct methods
.method public synthetic constructor <init>(La/zub0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/xub0;->a:La/zub0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)La/ig00;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p0, p0, La/xub0;->a:La/zub0;

    .line 4
    .line 5
    iget-object p0, p0, La/zub0;->d:La/dvb0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/dvb0;->g()La/ig00;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    .line 12
    sget-object p1, La/cvb0;->b:La/cvb0;

    iget-object p0, p0, La/xub0;->a:La/zub0;

    invoke-virtual {p0, p1}, La/zub0;->b(La/cvb0;)V

    const/4 p0, 0x0

    return-object p0
.end method
