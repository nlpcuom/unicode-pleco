package com.ciperlabs.unicodepleco.documentHandler.ConvertionEngine.LegacyToUnicodeFontMappings.Sinhala;

/**
 * Created by gayan@ciperlabs.com on 4/21/18.
 */
public class Thibus {


    public static String convert(String text) {

        text = text.replaceAll("Ý", "À");
        text = text.replaceAll("μ", "µ");
        text = text.replaceAll("´", "ÿ");
        text = text.replaceAll("ÁÛ", "ශ්‍රී");
        text = text.replaceAll("µµùÜß", "ත්‍රෛ");
        text = text.replaceAll("µûÜß\\[", "ප්‍රෞ");
        text = text.replaceAll("µµÁ", "ශෛ");
        text = text.replaceAll("µµë", "චෛ");
        text = text.replaceAll("µµí", "ජෛ");
        text = text.replaceAll("µµõ", "නෛ");
        text = text.replaceAll("µµæ", "කෛ");
        text = text.replaceAll("µµÿ", "මෛ");
        text = text.replaceAll("µµû", "පෛ");
        text = text.replaceAll("µµõ", "තෛ");
        text = text.replaceAll("µµø", "ධෛ");
        text = text.replaceAll("µµ<", "වෛ");
        text = text.replaceAll("µµ\\&", "සෛ");
        text = text.replaceAll("µµü", "එෛ");    //issue fixeds

        text = text.replaceAll("µÂ\\]\\$ß", "ෂ්‍යෝ");
        text = text.replaceAll("µí\\]\\$ß", "ඡ්‍යෝ");
        text = text.replaceAll("µò\\]\\$ß", "ඪ්‍යෝ");
        text = text.replaceAll("µé\\]\\$ß", "ඝ්‍යෝ");
        text = text.replaceAll("µç\\]\\$ß", "ඛ්‍යෝ");
        text = text.replaceAll("µ}\\]\\$ß", "ළ්‍යෝ");
        text = text.replaceAll("µü\\]\\$ß", "ඵ්‍යෝ");
        text = text.replaceAll("µñ\\]\\$ß", "ඨ්‍යෝ");
        text = text.replaceAll("µÁ\\]\\$ß", "ශ්‍යෝ");
        text = text.replaceAll("µ†\\]\\$ß", "ක්‍ෂ්යෝ");
        text = text.replaceAll("µý\\]\\$ß", "බ්‍යෝ");
        text = text.replaceAll("µë\\]\\$ß", "ච්‍යෝ");
        text = text.replaceAll("µò\\]\\$ß", "ඩ්‍යෝ");
        text = text.replaceAll("µ\\\\]\\$ß", "ෆ්‍යෝ");
        text = text.replaceAll("µè\\]\\$ß", "ග්‍යෝ");
        text = text.replaceAll("µí\\]\\$ß", "ජ්‍යෝ");
        text = text.replaceAll("µæ\\]\\$ß", "ක්‍යෝ");
        text = text.replaceAll("µÙ\\]\\$ß", "ල්‍යෝ");
        text = text.replaceAll("µÿ\\]\\$ß", "ම්‍යෝ");
        text = text.replaceAll("µù\\]\\$ß", "න්‍යෝ");
        text = text.replaceAll("µû\\]\\$ß", "ප්‍යෝ");
        text = text.replaceAll("µ÷À\\$ß", "ද්‍යෝ");
        text = text.replaceAll("µ\\&\\]\\$ß", "ස්‍යෝ");
        text = text.replaceAll("µð\\]\\$ß", "ට්‍යෝ");
        text = text.replaceAll("µ<\\]\\$ß", "ව්‍යෝ");
        text = text.replaceAll("µõ\\]\\$ß", "ත්‍යෝ");
        text = text.replaceAll("µþ\\]\\$ß", "භ්‍යෝ");
        text = text.replaceAll("µø\\]\\$ß", "ධ්‍යෝ");
        text = text.replaceAll("µö\\]\\$ß", "ථ්‍යෝ");

        text = text.replaceAll("µé\\]\\$", "ෂ්‍යො");
        text = text.replaceAll("µÁ\\]\\$", "ශ්‍යො");
        text = text.replaceAll("µç\\]\\$", "ඛ්‍යො");
        text = text.replaceAll("µ†\\$", "ක්‍ෂ්‍යො");
        text = text.replaceAll("µý\\]\\$", "බ්‍යො");
        text = text.replaceAll("µ<\\]\\$", "ව්‍යො");
        text = text.replaceAll("µò\\]\\$", "ඩ්‍යො");
        text = text.replaceAll("µ\\\\]\\$", "ෆ්යො");
        text = text.replaceAll("µè\\]\\$", "ග්‍යො");
        text = text.replaceAll("µí\\]\\$", "ජ්‍යො");
        text = text.replaceAll("µæ\\]\\$", "ක්‍යො");
        text = text.replaceAll("µÿ\\]\\$", "ම්‍යො");
        text = text.replaceAll("µû\\]\\$", "ප්‍යො");
        text = text.replaceAll("µ÷À\\]\\$", "ද්‍යො");
        text = text.replaceAll("µ\\&\\]\\$", "ස්‍යො");
        text = text.replaceAll("µð\\]\\$", "ට්‍යො");
        text = text.replaceAll("µ<\\]\\$", "ව්‍යො");
        text = text.replaceAll("µõ\\]\\$", "ත්‍යො");
        text = text.replaceAll("µþ\\]\\$", "භ්‍යො");
        text = text.replaceAll("µø\\]\\$", "ධ්‍යො");
        text = text.replaceAll("µö\\]\\$", "ථ්‍යො");

        text = text.replaceAll("µÂ\\]", "ෂ්‍යෙ");
        text = text.replaceAll("µì\\]", "ඡ්‍යෙ");
        text = text.replaceAll("µ}\\]", "ළ්‍යෙ");
        text = text.replaceAll("µó\\]", "ණ්‍යෙ");
        text = text.replaceAll("µë\\]", "ච්‍යෙ");
        text = text.replaceAll("µÙ\\]", "ල්‍යෙ");
        text = text.replaceAll("µù\\]", "න්යෙ");
        text = text.replaceAll("µÁ\\]", "ශ්‍යෙ");
        text = text.replaceAll("µç\\]", "ඛ්‍යෙ");
        text = text.replaceAll("µ†\\]", "ක්‍ෂ්‍යෙ");
        text = text.replaceAll("µý\\]", "බ්‍යෙ");
        text = text.replaceAll("µò\\]", "ඩ්‍යෙ");
        text = text.replaceAll("µ\\\\]", "ෆ්‍යෙ");
        text = text.replaceAll("µè\\]", "ග්‍යෙ");
        text = text.replaceAll("µí\\]", "ජ්‍යෙ");
        text = text.replaceAll("µæ\\]", "ක්‍යෙ");
        text = text.replaceAll("µÿ\\]", "ම්‍යෙ");
        text = text.replaceAll("µû\\]", "ප්‍යෙ");
        text = text.replaceAll("µ÷À\\]", "ද්‍යෙ");
        text = text.replaceAll("µ\\&\\]", "ස්‍යෙ");
        text = text.replaceAll("µð\\]", "ට්‍යෙ");
        text = text.replaceAll("µ<\\]", "ව්‍යෙ");
        text = text.replaceAll("µõ\\]", "ත්‍යෙ");
        text = text.replaceAll("µþ\\]", "භ්‍යෙ");
        text = text.replaceAll("µø\\]", "ධ්‍යෙ");
        text = text.replaceAll("µö\\]", "ථ්‍යෙ");

        text = text.replaceAll("µÂÜ\\$ß", "ෂ්‍රෝ");
        text = text.replaceAll("µéÜ\\$ß", "ඝ්‍රෝ");
        text = text.replaceAll("µÁÜ\\$ß", "ශ්‍රෝ");
        text = text.replaceAll("µ†\\$ß", "ක්‍ෂ්‍රෝ");
        text = text.replaceAll("µçÜ\\$ß", "බ්‍රෝ");
        text = text.replaceAll("µòÜ\\$ß", "ඩ්‍රෝ");
        text = text.replaceAll("µÜ\\$ß", "ෆ්‍රෝ");
        text = text.replaceAll("µèÜ\\$ß", "ග්‍රෝ");
        text = text.replaceAll("µæÜ\\$ß", "ක්‍රෝ");
        text = text.replaceAll("µûÜ\\$ß", "ප්‍රෝ");
        text = text.replaceAll("µ÷À\\$ß", "ද්‍රෝ");
        text = text.replaceAll("µûÜ\\$ß", "ස්‍රෝ");
        text = text.replaceAll("µðÜ\\$ß", "ට්‍රෝ");
        text = text.replaceAll("µõÜ\\$ß", "ත්‍රෝ");

        text = text.replaceAll("µÁÜ\\$", "ශ්‍රො");
        text = text.replaceAll("µòÜ\\$", "ඩ්‍රො");
        text = text.replaceAll("µ\\\\Ü\\$", "ෆ්‍රො");
        text = text.replaceAll("µèÜ\\$", "ග්‍රො");
        text = text.replaceAll("µæÜ\\$", "ක්‍රො");
        text = text.replaceAll("µûÜ\\$", "ප්‍රො");
        text = text.replaceAll("µ\\\\&Ü\\$", "ස්‍රො");
        text = text.replaceAll("µðÜ\\$", "ට්‍රො");
        text = text.replaceAll("µõÜ\\$", "ත්‍රො");

        text = text.replaceAll("µÁßÜ", "ශ්‍රේ");
        text = text.replaceAll("µçßÜ", "බ්‍රේ");
        text = text.replaceAll("µòßÜ", "ඩ්‍රේ");
        text = text.replaceAll("µ\\\\ßÜ", "ෆ්‍රේ");
        text = text.replaceAll("µèßÜ", "ග්‍රේ");
        text = text.replaceAll("µæßÜ", "ක්‍රේ");
        text = text.replaceAll("µûßÜ", "ප්‍රේ");
        text = text.replaceAll("µ÷Üß", "ද්‍රේ");
        text = text.replaceAll("µ\\&ßÜ", "ස්‍රේ");
        text = text.replaceAll("µõßÜ", "ත්‍රේ");
        text = text.replaceAll("µøßÜ", "ධ්‍රේ");
        text = text.replaceAll("µÂßÜ", "ෂ්‍රෙ");
        text = text.replaceAll("µÁßÜ", "ශ්‍රෙ");
        text = text.replaceAll("µýßÜ", "බ්‍රෙ");

        text = text.replaceAll("µ\\\\Ü", "ෆ‍රෙ");
        text = text.replaceAll("µèÜ", "ග‍රෙ");
        text = text.replaceAll("µæÜ", "කරෙ");
        text = text.replaceAll("µûÜ", "පරෙ");
        text = text.replaceAll("µ÷Ü", "දරෙ");
        text = text.replaceAll("µ\\&Ü", "සරෙ");
        text = text.replaceAll("µõÜ", "තරෙ");
        text = text.replaceAll("µþÜ", "භරෙ");
        text = text.replaceAll("µøÜ", "ධරෙ");

        text = text.replaceAll("µÂ\\[", "ෂෞ");
        text = text.replaceAll("µì\\[", "ඡෞ");
        text = text.replaceAll("µÁ\\[", "ශෞ");
        text = text.replaceAll("µç\\[", "බෞ");
        text = text.replaceAll("µë\\[", "චෞ");
        text = text.replaceAll("µò\\[", "ඩෞ");
        text = text.replaceAll("µ\\\\\\[", "ෆෞ");
        text = text.replaceAll("µè\\[", "ගෞ");
        text = text.replaceAll("µí\\[", "ජෞ");
        text = text.replaceAll("µæ\\[", "කෞ");
        text = text.replaceAll("µÙ\\[", "ලෞ");
        text = text.replaceAll("µÿ\\[", "මෞ");
        text = text.replaceAll("µù\\[", "නෞ");
        text = text.replaceAll("µû\\[", "පෞ");
        text = text.replaceAll("µ÷À\\[", "දෞ");
        text = text.replaceAll("µØ\\[", "රෞ");
        text = text.replaceAll("µ\\&\\[", "සෞ");
        text = text.replaceAll("µð\\[", "ටෞ");
        text = text.replaceAll("µõ\\[", "තෞ");
        text = text.replaceAll("µþ\\[", "භෞ");
        text = text.replaceAll("µîÀ\\[", "ඤෞ");

        text = text.replaceAll("µÂ\\$ß", "ෂෝ");
        text = text.replaceAll("µÖ\\$ß", "ඹෝ");
        text = text.replaceAll("µì\\$ß", "ඡෝ");
        text = text.replaceAll("µñ\\$ß", "ඪෝ");
        text = text.replaceAll("µé\\$ß", "ඝෝ");
        text = text.replaceAll("µç\\$ß", "ඛෝ");
        text = text.replaceAll("μ\\}\\$ß", "ළෝ");
        text = text.replaceAll("µÙ\\$ß", "ලෝ");
        text = text.replaceAll("µê\\$ß", "ඟෝ");
        text = text.replaceAll("µó\\$ß", "ණෝ");
        text = text.replaceAll("µö\\$ß", "ඵෝ");
        text = text.replaceAll("µñ\\$ß", "ඨෝ");
        text = text.replaceAll("µô\\$ß", "ඬෝ");
        text = text.replaceAll("µÁ\\$ß", "ශෝ");
        text = text.replaceAll("µïÀ\\$ß", "ඥෝ");
        text = text.replaceAll("µúÀ\\$ß", "ඳෝ");
        text = text.replaceAll("µÂ\\$ß", "ෂෝ");
        text = text.replaceAll("µý\\$ß", "බෝ");
        text = text.replaceAll("µë\\$ß", "චෝ");
        text = text.replaceAll("µò\\$ß", "ඩෝ");
        text = text.replaceAll("µ\\\\$ß", "ෆෝ");
        text = text.replaceAll("µè\\$ß", "ගෝ");
        text = text.replaceAll("µ\\{\\$ß", "හෝ");
        text = text.replaceAll("µí\\$ß", "ජෝ");
        text = text.replaceAll("µæ\\$ß", "කෝ");
        text = text.replaceAll("µ\\}\\$ß", "ලෝ");
        text = text.replaceAll("µÿ\\$ß", "මෝ");
        text = text.replaceAll("µù\\$ß", "නෝ");
        text = text.replaceAll("µû\\$ß", "පෝ");
        text = text.replaceAll("µ÷À\\$ß", "දෝ");
        text = text.replaceAll("µØ\\$ß", "රෝ");
        text = text.replaceAll("µ\\&\\$ß", "සෝ");
        text = text.replaceAll("µð\\$ß", "ටෝ");
        text = text.replaceAll("µ<\\$ß", "වෝ");
        text = text.replaceAll("µõ\\$ß", "තෝ");
        text = text.replaceAll("µþ\\$ß", "භෝ");
        text = text.replaceAll("µ×\\$ß", "යෝ");
        text = text.replaceAll("µîÀ\\$ß", "ඤෝ");
        text = text.replaceAll("µø\\$ß", "ධෝ");
        text = text.replaceAll("µö\\$ß", "ථෝ");

        text = text.replaceAll("µÂ\\$", "ෂො");
        text = text.replaceAll("µÖ\\$", "ඹො");
        text = text.replaceAll("µì\\$", "ඡො");
        text = text.replaceAll("µé\\$", "ඝො");
        text = text.replaceAll("µç\\$", "ඛො");
        text = text.replaceAll("µ\\}\\$", "ළො");
        text = text.replaceAll("µê\\$", "ඟො");
        text = text.replaceAll("µó\\$", "ණො");
        text = text.replaceAll("µü\\$", "ඵො");
        text = text.replaceAll("µñ\\$", "ඨො");
        text = text.replaceAll("µô\\$", "ඬො");
        text = text.replaceAll("µÁ\\$", "ශො");
        text = text.replaceAll("µïÀ\\$", "ඥො");
        text = text.replaceAll("µúÀ\\$", "ඳො");
        text = text.replaceAll("µÂ\\$", "ෂො");
        text = text.replaceAll("µý\\$", "බො");
        text = text.replaceAll("µë\\$", "චො");
        text = text.replaceAll("µò\\$", "ඩො");
        text = text.replaceAll("µ\\\\$", "ෆො");
        text = text.replaceAll("µè\\$", "ගො");
        text = text.replaceAll("µ\\{\\$", "හො");
        text = text.replaceAll("µí\\$", "ජො");
        text = text.replaceAll("µæ\\$", "කො");
        text = text.replaceAll("µÙ\\$", "ලො");
        text = text.replaceAll("µÿ\\$", "මො");
        text = text.replaceAll("µù\\$", "නො");
        text = text.replaceAll("µû\\$", "පො");
        text = text.replaceAll("µ÷À\\$", "දො");
        text = text.replaceAll("µØ\\$", "රො");
        text = text.replaceAll("µ\\&\\$", "සො");
        text = text.replaceAll("µð\\$", "ටො");
        text = text.replaceAll("µ<\\$", "වො");
        text = text.replaceAll("µõ\\$", "තො");
        text = text.replaceAll("µþ\\$", "භො");
        text = text.replaceAll("µ×\\$", "යො");
        text = text.replaceAll("µîÀ\\$", "ඤො");
        text = text.replaceAll("µø\\$", "ධො");
        text = text.replaceAll("µö\\$", "ථො");

        text = text.replaceAll("µÂß", "ෂේ");
        text = text.replaceAll("µ¡", "ඹේ");
        text = text.replaceAll("µ¨", "ඡේ");
        text = text.replaceAll("µìß", "ඡේ");
        text = text.replaceAll("µéß", "ඝේ");
        text = text.replaceAll("µ¤", "ඛේ");
        text = text.replaceAll("µÙß", "ලේ");
        text = text.replaceAll("µ}ß", "ළේ");
        text = text.replaceAll("µêß", "ඟේ");
        text = text.replaceAll("µóß", "ණේ");
        text = text.replaceAll("µüß", "ඵේ");
        text = text.replaceAll("µøß", "ඨේ");
        text = text.replaceAll("µ¹", "ඬේ");
        text = text.replaceAll("µÁß", "ශේ");
        text = text.replaceAll("µïÀß", "ඥේ");
        text = text.replaceAll("µúÀß", "ඳේ");
        text = text.replaceAll("µ†ß", "ක්‍ෂේ");
        text = text.replaceAll("µÅ", "බේ");
        text = text.replaceAll("µ§", "චේ");
        text = text.replaceAll("µ³", "ඩේ");
        text = text.replaceAll("µ\\\\ß", "ෆේ");
        text = text.replaceAll("µèß", "ගේ");
        text = text.replaceAll("µ\\{ß", "හේ");
        text = text.replaceAll("µíß", "ජේ");
        text = text.replaceAll("µÊ", "ජේ");
        text = text.replaceAll("µæß", "කේ");
        text = text.replaceAll("µÈ", "මේ");
        text = text.replaceAll("µùß", "නේ");
        text = text.replaceAll("µûß", "පේ");
        text = text.replaceAll("µ÷Àß", "දේ");
        text = text.replaceAll("µÌ", "රේ");
        text = text.replaceAll("µØß", "රේ");
        text = text.replaceAll("µ\\&ß", "සේ");
        text = text.replaceAll("µ>", "ටේ");
        text = text.replaceAll("µÓ", "වේ");
        text = text.replaceAll("µõß", "තේ");
        text = text.replaceAll("µþß", "භේ");
        text = text.replaceAll("µ×ß", "යේ");
        text = text.replaceAll("µîÀß", "ඤේ");
        text = text.replaceAll("µøß", "ධේ");
        text = text.replaceAll("µöß", "ථේ");
        text = text.replaceAll("µíß", "ජේ");
        text = text.replaceAll("îÀß/", "ඤ්");
        text = text.replaceAll("îÀa", "ඤ්");
        text = text.replaceAll("îÀd", "ඤාා");
        text = text.replaceAll("îÀ", "ඤා");
        text = text.replaceAll("wE", "ඈ");
        text = text.replaceAll("à\\|", "ඈ");
        text = text.replaceAll("µÂ", "ෂෙ");
        text = text.replaceAll("µÖ", "ඹෙ");
        text = text.replaceAll("µË", "ඹ්ෙ");
        text = text.replaceAll("µü", "ඓ");
        text = text.replaceAll("µì", "ඡෙ");
        text = text.replaceAll("µé", "ඝෙ");
        text = text.replaceAll("µç", "ඛෙ");
        text = text.replaceAll("µ\\}", "ළෙ");
        text = text.replaceAll("µÙ", "ලෙ");
        text = text.replaceAll("µê", "ඟෙ");
        text = text.replaceAll("µó", "ණෙ");
        text = text.replaceAll("µü", "ඵෙ");
        text = text.replaceAll("µñ", "ඨෙ");
        text = text.replaceAll("µô", "ඬෙ");
        text = text.replaceAll("µÁ", "ශෙ");
        text = text.replaceAll("µïÀ", "ඥෙ");
        text = text.replaceAll("µúÀ", "ඳෙ");
        text = text.replaceAll("µ†", "ක්‍ෂෙ");
        text = text.replaceAll("µý", "බෙ");
        text = text.replaceAll("µë", "චෙ");
        text = text.replaceAll("µò", "ඩෙ");
        text = text.replaceAll("µ\\\\", "ෆෙ");
        text = text.replaceAll("µè", "ගෙ");
        text = text.replaceAll("µþ", "හෙ");
        text = text.replaceAll("µ\\{", "භෙ");
        text = text.replaceAll("µí", "ජෙ");
        text = text.replaceAll("µæ", "කෙ");
        text = text.replaceAll("µ´", "මෙ");
        text = text.replaceAll("µù", "නෙ");
        text = text.replaceAll("µû", "පෙ");
        text = text.replaceAll("µ÷À", "දෙ");
        text = text.replaceAll("µØ", "රෙ");
        text = text.replaceAll("µ\\&", "සෙ");            //@Gayan
        text = text.replaceAll("µð", "ටෙ");
        text = text.replaceAll("µ<", "වෙ");
        text = text.replaceAll("µõ", "තෙ");
        text = text.replaceAll("µ×", "යෙ");
        text = text.replaceAll("µîÀ", "ඤෙ");
        text = text.replaceAll("µø", "ධෙ");
        text = text.replaceAll("µö", "ථෙ");

        text = text.replaceAll("úÞÀ", "ඳැ");
        text = text.replaceAll("à`", "ඇ");
        text = text.replaceAll("’/", "රැ");

        text = text.replaceAll("Â##", "ෂෲ");
        text = text.replaceAll("Á##", "ශෲ");
        text = text.replaceAll("ç##", "බෲ");
        text = text.replaceAll("ò##", "ඩෲ");
        text = text.replaceAll("\\##", "ෆෲ");
        text = text.replaceAll("è##", "ගෲ");
        text = text.replaceAll("æ##", "කෲ");
        text = text.replaceAll("û##", "පෲ");
        text = text.replaceAll("\\&##/", "සෲ");
        text = text.replaceAll("ð##", "ටෲ");
        text = text.replaceAll("õ##", "තෲ");
        text = text.replaceAll("þ##", "භෲ");
        text = text.replaceAll("ø##", "ධෲ");

        text = text.replaceAll("Ø\\|", "රූ");
        text = text.replaceAll("~", "රූ");
        text = text.replaceAll("õÞ", "තූ");
        text = text.replaceAll("ÁÞ", "ශූ");
        text = text.replaceAll("æÞ", "කූ");
        text = text.replaceAll("þÞ", "භූ");
        text = text.replaceAll("èÞ", "ගූ");
        text = text.replaceAll("úÕ", "ඳු");
        text = text.replaceAll("úÔ", "ඳු");
        text = text.replaceAll("÷Õ", "දු");
        text = text.replaceAll("÷¼", "දූ");

        text = text.replaceAll("Ð", "ලූ");

        text = text.replaceAll("\\&#", "ඍ");
        text = text.replaceAll("ã\\[", "ඌ");
        text = text.replaceAll("å\\[", "ඖ");
        text = text.replaceAll("ã", "උ");
        text = text.replaceAll("õÀ", "තු");
        text = text.replaceAll("èÀ", "ගු");
        text = text.replaceAll("æÀ", "කු");
        text = text.replaceAll("þÀ", "භු");
        text = text.replaceAll("Ø`", "රු");
        text = text.replaceAll("ú¸", "ඳු");
        text = text.replaceAll("úÔ", "ඳු");
        text = text.replaceAll("÷¸", "දු");
        text = text.replaceAll("÷¼", "දූ");
        text = text.replaceAll("÷Ô", "දු");
        text = text.replaceAll("÷Ü", "දු");
        text = text.replaceAll("Ï-", "ලු");
        text = text.replaceAll("Ï", "ලු");
        text = text.replaceAll("<Ô", "වු");
        text = text.replaceAll("äß", "ඒ");
        text = text.replaceAll("¡", "ඕ");
        text = text.replaceAll("¤", "ඛ්");
        text = text.replaceAll("§", "ච්");
        text = text.replaceAll("¨", "ඡ්");
        text = text.replaceAll("³", "ඩ්");
        text = text.replaceAll("¹", "ඬ්");
        text = text.replaceAll("¿", "ධ්");
        text = text.replaceAll("Å", "බ්");
        text = text.replaceAll("È", "ම්");
        text = text.replaceAll("Ê", "ජ්");
        text = text.replaceAll("Ë", "ඹ්");
        text = text.replaceAll("Ì", "ර්");
        text = text.replaceAll("\\^", "ඬ්");
        text = text.replaceAll("æß", "ක්");
        text = text.replaceAll("Ó", "ව්");
        text = text.replaceAll(">", "ට්");
        text = text.replaceAll("\\£", "ඛී");
        text = text.replaceAll("\\¦", "චී");
        text = text.replaceAll("ª", "ඡී");
        text = text.replaceAll("«", "ඹී");
        text = text.replaceAll("¯", "ටී");
        text = text.replaceAll("²", "ඩී");
        text = text.replaceAll("¶", "ජී");
        text = text.replaceAll("»", "ඬී");
        text = text.replaceAll("¾", "ධී");
        text = text.replaceAll("Ä", "බී");
        text = text.replaceAll("Ç", "මී");
        text = text.replaceAll("Î", "රී");
        text = text.replaceAll("÷ÀÛ", "දී");
        text = text.replaceAll("â", "ඊ");
        text = text.replaceAll("Ò", "වී");
        text = text.replaceAll("á", "ඉ");
        text = text.replaceAll("¢", "ඛි");
        text = text.replaceAll("\\¥", "චි");
        text = text.replaceAll("©", "ඡි");
        text = text.replaceAll("¬", "ජි");
        text = text.replaceAll("®", "ටි");
        text = text.replaceAll("±", "ඩි");
        text = text.replaceAll("½", "ධි");
        text = text.replaceAll("Ã", "බි");
        text = text.replaceAll("Æ", "මි");
        text = text.replaceAll("É", "ඹි");
        text = text.replaceAll("Í", "රි");
        text = text.replaceAll("Ñ", "වි");
        text = text.replaceAll("à\\$", "ආ");
        text = text.replaceAll("\\&", "ස");                //@Gayan		&Ú‘{Ù
        text = text.replaceAll("<", "ව");
        text = text.replaceAll("\\\\", "ෆ");
        text = text.replaceAll("_", "ළු");
        text = text.replaceAll("\\{", "හ");
        text = text.replaceAll("\\}", "ළ");
        text = text.replaceAll("†", "ක්‍ෂ");
        text = text.replaceAll("´", "ම");
        text = text.replaceAll("Á", "ශ");
        text = text.replaceAll("Â", "ෂ");
        text = text.replaceAll("Ö", "ඹ");
        text = text.replaceAll("×", "ය");
        text = text.replaceAll("Ø", "ර");
        text = text.replaceAll("Ù", "ල");
        text = text.replaceAll("à", "අ");
        text = text.replaceAll("ä", "එ");
        text = text.replaceAll("å", "ඔ");
        text = text.replaceAll("æ", "ක");
        text = text.replaceAll("ç", "ඛ");
        text = text.replaceAll("è", "ග");
        text = text.replaceAll("é", "ඝ");
        text = text.replaceAll("ê", "ඟ");
        text = text.replaceAll("ë", "ච");
        text = text.replaceAll("ì", "ඡ");
        text = text.replaceAll("í", "ජ");
        text = text.replaceAll("ð", "ට");
        text = text.replaceAll("ñ", "ඨ");
        text = text.replaceAll("ò", "ඩ");
        text = text.replaceAll("ó", "ණ");
        text = text.replaceAll("ô", "ඬ");
        text = text.replaceAll("õ", "ත");
        text = text.replaceAll("ö", "ථ");
        text = text.replaceAll("ø", "ධ");
        text = text.replaceAll("ù", "න");
        text = text.replaceAll("û", "ප");
        text = text.replaceAll("ü", "එ");
        text = text.replaceAll("ý", "බ");
        text = text.replaceAll("þ", "භ");
        text = text.replaceAll("ÿ", "ම");
        text = text.replaceAll("÷À", "ද");
        text = text.replaceAll("úÀ", "ඳ");
        text = text.replaceAll("ïÀ", "ඥ");
        text = text.replaceAll("÷º", "ද්‍ර");

        text = text.replaceAll("Ü", "‍්‍ර");
        text = text.replaceAll("º", "‍්‍ර");
        text = text.replaceAll("`", "ැ");
        text = text.replaceAll("\\|", "ෑ");
        text = text.replaceAll("Ô", "ු");
        text = text.replaceAll("Õ", "ූ");
        text = text.replaceAll("¸", "ු");
        text = text.replaceAll("Þ", "ු");
        text = text.replaceAll("¼", "ූ");
        text = text.replaceAll("Ú", "ි");
        text = text.replaceAll("Û", "ී");
        text = text.replaceAll("#", "ෘ");
        text = text.replaceAll("\\[", "ෟ");
        text = text.replaceAll("\\$", "ා");
        text = text.replaceAll("ß", "්");
        text = text.replaceAll("‘", "ං");
        text = text.replaceAll("\\]", "්‍ය");
        text = text.replaceAll("À", "ු");
        text = text.replaceAll("µ", "ෙ");    // this should be avoided, but no choice due to the font mixing		@Gayan
        text = text.replaceAll("÷ැ", "දැ");    // This is a common error	@Gayan


        return text;
    }

    public static boolean lastCharError(String text) {
        if (text.endsWith("µ")) {
            return true;
        } else {
            return false;
        }
    }

    public static String fixLastCharError(String text) {
        return "µ" + text;
    }

    public static boolean lastCharError2(String text) {
        if (text.endsWith("ú")) {
            return true;
        } else {
            return false;
        }
    }

    public static String fixLastCharError2(String text) {
        return "ú" + text;
    }
}
