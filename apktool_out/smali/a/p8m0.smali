.class public final synthetic La/p8m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnPartialImageListener;


# instance fields
.field public final synthetic a:La/x68;


# direct methods
.method public synthetic constructor <init>(La/x68;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p8m0;->a:La/x68;

    return-void
.end method


# virtual methods
.method public final onPartialImage(Landroid/graphics/ImageDecoder$DecodeException;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/p8m0;->a:La/x68;

    .line 2
    .line 3
    iget-object p0, p0, La/x68;->b:La/a780;

    .line 4
    .line 5
    sget-object p1, La/t1x;->f:La/kuo;

    .line 6
    .line 7
    invoke-static {p0, p1}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method
